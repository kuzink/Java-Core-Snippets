package streams;

import java.util.*;
import java.util.stream.*;

public class Main {

    //private static List<Book> bookList = new ArrayList<>();

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
    


    private List<String> getBookNames(List<Book> books) {
        return books.stream()
            .map(Book::getName)
            .collect(Collectors.toList());
    }

    private List<Tag> getBookTags(List<Book> books) {
        return books.stream()
            .flatMap(el -> el.getTags().stream())
            .collect(Collectors.toList());
    }

    private Integer getBooksCount(List<Book> books) {
        return books.stream()
            .map(e -> 1)
            .reduce(0, (a, b) -> a + b);
    }

    private Integer getAmount(List<Book> books) {
        return books.stream()
            .map(Book::getPrice)
            .reduce(0, Integer::sum);
    }

//    private double getAvgBookPrice(List<Book> books) {
//        return books.stream()
//            .mapToInt(Book::getPrice)
//            .summaryStatistics()
//            .getAverage();
//    }

    private Integer getAvgBookPrice(List<Book> books) {
        return books.stream()
            .mapToInt(Book::getPrice)
            .average().stream()
            .mapToLong(Math::round)
            .mapToInt(el -> (int) el)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Cant calculate avg book price"));
    }

    private Map<Integer, List<Book>> getBooksGroupedByPrice(List<Book> books) {
        return books.stream()
            .collect(Collectors.groupingBy(Book::getPrice));
    }

    private Map<Integer, List<String>> getBookNamesGroupedByPrice(List<Book> books) {
        return books.stream()
            .collect(
                Collectors.groupingBy(
                    Book::getPrice,
                    Collectors.mapping(Book::getName, Collectors.toList())
                ));
    }

    private Map<Integer, String> getBookNamesGroupedByPriceV2(List<Book> books) {
        return books.stream()
            .collect(
                Collectors.groupingBy(
                    Book::getPrice,
                    Collectors.mapping(Book::getName, Collectors.joining(", ", "{", "}"))
                ));
    }

    private Map<String, Integer> getBooksMap(List<Book> books) {
        return books.stream()
            .collect(Collectors.toMap(Book::getName, Book::getPrice));
    }

    private int getStackOverflowError(int i) {
        return getStackOverflowError(i + 1);
    }

    private void getOutOfMemoryError() {
        final List<Book> bookList = new ArrayList<>();
        Stream.generate(() -> bookList.add(new Book(111, "111", Collections.emptyList())))
                .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        Main main = new Main();

        //Найти названия всех книг
        System.out.println("1. getBookNames() : " + main.getBookNames(BOOKS));

        //Найти все теги книг
        System.out.println("2. getBookTags() : " + main.getBookTags(BOOKS));

        //Найти количество книг
        System.out.println("3. getBooksCount() : " + main.getBooksCount(BOOKS));

        //Найти общую сумму всех книг
        System.out.println("4. getAmount() : " + main.getAmount(BOOKS));

        //Найти среднюю цену книги (округленное до целого)
        System.out.println("5. getAvgBookPrice() : " + main.getAvgBookPrice(BOOKS));

        //Сгруппировать книги по цене
        System.out.println("6. getBooksGroupedByPrice() : " + main.getBooksGroupedByPrice(BOOKS));

        //Сгруппировать названия книг по цене
        System.out.println("7. getBookNamesGroupedByPrice() : " + main.getBookNamesGroupedByPrice(BOOKS));

        //Сгруппировать названия книг(строкой, через запятую) по цене
        System.out.println("8. getBookNamesGroupedByPriceV2() : " + main.getBookNamesGroupedByPriceV2(BOOKS));

        //Получить Map вида key=name, value=price
        System.out.println("9. getBooksMap() : " + main.getBooksMap(BOOKS));

        //main.getOutOfMemoryError();
        //main.getStackOverflowError(1);

    }



}
