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
