package algorithms;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class SameNumberInThreeArrays {

    //Даны три неубывающих массива чисел. Найти число, которое присутствует во всех трех массивах.
    //Input: [1,2,4,5], [3,3,4], [2,3,4,5,6]
    //Output: 4
    //Целевое решение работает за O(p + q + r), где p, q, r – длины массивов, доп. память O(1)

    private final static int[] ARRAY_1 = {1, 2, 4, 5}, ARRAY_2 = {3, 3, 4}, ARRAY_3 = {2, 3, 4, 5, 6};


    public static void main(String[] args) {
        SameNumberInThreeArrays main = new SameNumberInThreeArrays();
        //main.ex1();
        //main.ex2();
        main.ex3();
    }


    //1 Вариант через стримы
    private void ex1() {
        int[] result = Stream.of(ARRAY_1, ARRAY_2, ARRAY_3)
            .flatMap(el -> Arrays.stream(el).distinct().boxed())
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .filter(el -> el.getValue() == 3)
            .mapToInt(el -> el.getKey().intValue())
            .toArray();
        System.out.println(Arrays.toString(result));
    }



    //2 Вариант без стримов
    private void ex2() {
        for (int el : ARRAY_1) {
            if (isContain(ARRAY_2, el) && isContain(ARRAY_3, el)) {
                System.out.println(el);
            }
        }
    }

    private boolean isContain(int[] arr, int el) {
        for (int item : arr) {
            if (item == el) return true;
        }
        return false;
    }



    //3 Вариант (нашел: https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/)
    private void ex3() {
        int i = 0, j = 0, k = 0;

        while (i < ARRAY_1.length && j < ARRAY_2.length && k < ARRAY_3.length) {

            if (ARRAY_1[i] == ARRAY_2[j] && ARRAY_2[j] == ARRAY_3[k]) {
                System.out.println(ARRAY_1[i]);
                i++;
                j++;
                k++;
            }
            else if (ARRAY_1[i] < ARRAY_2[j]) {
                i++;
            }
            else if (ARRAY_2[j] < ARRAY_3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
    }

}
