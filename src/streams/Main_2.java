package streams;

import java.util.*;
import java.util.stream.*;

public class Main_2 {

    static class Person {
        private String name;
        private String surname;
        private Integer age;

        public Person(String name, String surname, Integer age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public Integer getAge() {
            return age;
        }
    }

    private static List<String> getSortedLastNames(List<Person> people) {
        return people.stream()
            .filter(el -> el.getAge() > 25)
            .map(el -> el.surname.toUpperCase())
            .sorted(Comparator.naturalOrder())
            .peek(System.out::println)
            .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("John", "Doe", 25),
            new Person("Jane", "Doe", 30),
            new Person("Bob", "Smith", 20),
            new Person("Alice", "Jones", 35),
            new Person("Mary", "Johnson", 40)
        );


        getSortedLastNames(people);
    }
}

interface A {
    void fuck();
}

interface B {
    String fuck();
}

interface Foo extends A {

    public static final int A = 1;

    public abstract void print();

    default void make() {
        System.out.println("make()");
        System.out.println(subMake());
        System.out.println(staticSubMake());

    }

    private String subMake() {
        return "subMake()";
    }


    static String staticSubMake() {
        return "staticSubMake()";
    }
}

//class ABClass implements streams.A, streams.B {
//
//
//    @Override
//    public void fuck() {
//
//    }
//}