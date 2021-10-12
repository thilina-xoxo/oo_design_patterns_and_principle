package Lecture_2;

import java.util.List;

public interface NameStore {
    void store(String name);

    List<String> getNames();
}
