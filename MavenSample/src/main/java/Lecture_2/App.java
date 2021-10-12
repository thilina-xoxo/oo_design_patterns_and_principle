package Lecture_2;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        NameStore fileStore = new InMemoryNameStore();

        NameStore nameStore = new CacheNameStore(fileStore);
        // Super type -> reffefence of super type = Sub type of super type
        // The ability of change subtypes is liskov-substitution principle

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if("show".equals(line)) {
                nameStore.getNames().forEach(n -> System.out.println(n+" "));
            }
            nameStore.store(line);



        }


    }
}

// cohesion and tightly coupled