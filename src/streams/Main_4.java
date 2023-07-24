package streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.util.List.*;

public class Main_4 {


    static final List<String> list = of("a", "b", "c", "a", "b", "a");


    public static void main(String[] args) {

        //С помощью Stream получить Map<String, Integer> вида {"a"=3, "b"=2, "c"=1}
        // т.е. для каждой строки найти количество ее вхождений
        Map<String, Long> result = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("result: " + result);
    }



}
