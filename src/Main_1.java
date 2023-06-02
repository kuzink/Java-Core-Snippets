import java.util.*;
import java.util.stream.*;

public class Main_1 {

    static class Book {
        private Integer price;
        private String name;
        private List<Tag> tags;

        Book(Integer price, String name, List<Tag> tags) {
            this.price = price;
            this.name = name;
            this.tags = tags;
        }

        public Integer getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public List<Tag> getTags() {
            return tags;
        }
    }

    static class Tag {
        Long id;
        String name;

        Tag(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Tag{" + "id=" + id + ", name='" + name + '\'' + '}';
        }
    }

    static class BookService {

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
    }



    public static void main(String[] args) {

        Tag tag_1 = new Tag(1L, "1");
        Tag tag_2 = new Tag(2L, "2");
        Tag tag_3 = new Tag(3L, "3");

        Book book_1 = new Book(100, "Book 1", List.of(tag_1, tag_2));
        Book book_2 = new Book(200, "Book 2", List.of(tag_3));


        BookService bookService = new BookService();

        System.out.println("getBookNames() : " + bookService.getBookNames(List.of(book_1, book_2)));
        System.out.println("getBookTags() : " + bookService.getBookTags(List.of(book_1, book_2)));
        System.out.println("getBooksCount() : " + bookService.getBooksCount(List.of(book_1, book_2)));
        System.out.println("getAmount() : " + bookService.getAmount(List.of(book_1, book_2)));
    }
}
