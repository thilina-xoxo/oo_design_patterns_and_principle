package Lecture_2;

import java.util.ArrayList;
import java.util.List;

public class InMemoryNameStore implements NameStore {

    private List<String> names = new ArrayList<>();

    @Override
    public void store(String name) {
        names.add(name);
    }

    @Override
    public List<String> getNames() {
        return names;
    }
}

// @Override annotation java
