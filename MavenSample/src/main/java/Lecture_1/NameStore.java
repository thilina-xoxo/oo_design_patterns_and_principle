package Lecture_1;

import java.util.List;

public interface NameStore {
    void store(String name);

    List<String> getNames();
}
