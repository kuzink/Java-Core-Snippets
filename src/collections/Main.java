package collections;

import streams.*;

import java.util.*;
import java.util.stream.*;

public class Main {

    private static final List<Tag> TAGS = List.of(
        new Tag(1L, "1"),
        new Tag(2L, "2"),
        new Tag(3L, "3")
    );

    private static final List<Book> BOOKS = List.of(
        new Book(100, "Book 1", List.of(TAGS.get(0), TAGS.get(1))),
        new Book(200, "Book 2", List.of(TAGS.get(2))),
        new Book(300, "Book 3", Collections.emptyList()),
        new Book(200, "Book 4", Collections.emptyList()),
        new Book(300, "Book 5", Collections.emptyList())
    );


    
    public static void main(String[] args) {
        Main main = new Main();



    }



}
