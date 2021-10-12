package Lecture_2;

import java.util.List;

public class CacheNameStore implements NameStore {

    private NameStore cache;
    private final NameStore fileStore;

    public CacheNameStore( NameStore fileStore) { // cache name store is depending on file store, it has been
// injected through the constructor -> dependency inversion principal (SOLID {D})
        this.fileStore = fileStore; // final variables can be assign one time only - during construction
    }

    @Override
    public void store(String name) {
        if(cache != null){
            cache.store(name);
        }
        fileStore.store(name);
    }

    @Override
    public List<String> getNames() {


        if(cache == null) {
            List<String> namesInFileStore = fileStore.getNames();
            cache = new InMemoryNameStore();

            for (String name:namesInFileStore){   // if cache is null only store names in the cache from file
                cache.store(name);
            }
        }


        return cache.getNames();

    }
}
