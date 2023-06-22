package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static final List<Person> PERSON_LIST = List.of(
            new Person(15, "Alina"),
            new Person(12, "Julia"),
            new Person(11, "Sveta"),
            new Person(14, "Ira"),
            new Person(13, "Masha"),
            new Person(11, "Anna")
    );

    private static final List<PersonComparable> PERSON_COMPARABLE_LIST = List.of(
            new PersonComparable(15, "Alina"),
            new PersonComparable(12, "Julia"),
            new PersonComparable(11, "Sveta"),
            new PersonComparable(14, "Ira"),
            new PersonComparable(13, "Masha"),
            new PersonComparable(11, "Anna")
    );

    public static void main(String[] args) {

        final List<Person> personListSorted = new ArrayList<>(PERSON_LIST);
        final List<PersonComparable> personComparableListSorted = new ArrayList<>(PERSON_COMPARABLE_LIST);

        //sort by age
        personListSorted.sort(Comparator.comparingInt(Person::getAge)); //or (el1, el2) -> el1.getAge() - el2.getAge()
        System.out.println("1. personListSortedByAge: " + personListSorted);

        Collections.sort(personComparableListSorted);
        System.out.println("1. personComparableListSortedByAge: " + personComparableListSorted);

        //sort by name
        personListSorted.sort(Comparator.comparing(Person::getName));
        System.out.println("2. personListSortedByName: " + personListSorted);

        personComparableListSorted.sort(Comparator.comparing(PersonComparable::getName));
        System.out.println("2. personComparableSortedByName: " + personComparableListSorted);

        //sort by age, then by name
        personListSorted.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        System.out.println("3. personListSortedByAgeAndThenByName: " + personListSorted);

        personComparableListSorted.sort(Comparator.comparingInt(PersonComparable::getAge).thenComparing(PersonComparable::getName));
        System.out.println("3. personComparableListSortedByAgeAndThenByName: " + personComparableListSorted);
    }


}
