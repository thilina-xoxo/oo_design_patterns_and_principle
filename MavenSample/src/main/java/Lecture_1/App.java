package Lecture_1;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        NameStore nameStore = new FileBaseNameStore();
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

// single responsibility - one class do only thing at a time
// open close principle - close for modification open for extensions
// polymorphism - same name different behaviours (name store has two InMemory and FileBase)

// SOLID

// single responsibility principle
// open close principle
// liskov substitution principle
// interface segregation principle
// dependency invertion principle