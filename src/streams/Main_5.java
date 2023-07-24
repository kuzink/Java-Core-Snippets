package streams;

import java.util.stream.*;

public class Main_5 {

    public static void main(String[] args) {
        Main_5 main = new Main_5();

        //main.ex1();
        //main.ex2();
        main.ex3();
    }

    private void ex1() {
        int result = Stream.of(1, 2, 3, 4, 5)
            //.parallel()
            .reduce(5, (x, y) -> x + y); //без .parallel() будет 20, с .parallel() будет 40

        System.out.println(result);
    }

    private void ex2() {
        Stream.of("A", "B", "C")
            .peek(System.out::println)
            //.sorted()
            .forEach(System.out::println); //без .sorted() будет AABBCC, c .sorted() будет ABCABC
    }

    private void ex3() {
        Stream.of(1, 4, 3)
            .peek(System.out::println)
            .sorted()
            .peek(System.out::println)
            .anyMatch(el -> el == 3); //без .sorted() будет 114433, c .sorted() будет 14313
    }

}
