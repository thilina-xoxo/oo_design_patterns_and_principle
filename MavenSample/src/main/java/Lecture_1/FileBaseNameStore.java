package Lecture_1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileBaseNameStore implements NameStore{

    // encapsulation - no one knows about this file excpt this class
    private String fileName = "D://Engineering/Java/ChamilSir/name.txt";

    @Override
    public void store(String name) {
        try {
            FileWriter writer = new FileWriter(fileName,true);
            writer.append(name +"\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(fileName + "couldn't read", e);
        }

    }

    @Override
    public List<String> getNames() {
        try {
            return Files.readAllLines(Path.of(fileName));
        } catch (IOException e) {
            throw new RuntimeException("Error while reading the file" + fileName,e);
        }
    }
}

// single responsibility