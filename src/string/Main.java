package string;

public class Main {

    public static void main(String[] args) {

//        example_1(); //312
//        example_2(); //Compilation error
//        example_3(); //true
//        example_4(); //false
//        example_5(); //true
//        example_6(); //false
//        example_7(); //true
//        example_8(); //false

        Test_1 test_1 = new Test_1();

    }

    private static void example_1() {
        System.out.println('b' + 'c' + 's');
    }

//    private static void example_2() {
//        final int i;
//        i = 15;
//        int j = i+20;
//        i = j+30;
//        System.out.println(i + " " + j);
//    }

    private static void example_3() {
        String str1 = "Something";
        String str2 = "Something";
        System.out.println(str1 == str2);
    }

    private static void example_4() {
        String str1 = new String("Something");
        String str2 = "Something";
        System.out.println(str1 == str2);
    }

    private static void example_5() {
        Integer i = 1;
        Integer j = 1;
        System.out.println(i == j);
    }

    private static void example_6() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
    }

    private static void example_7() {
        Integer i = 12;
        Integer j = Integer.valueOf(12);
        System.out.println(i == j);
    }

    private static void example_8() {
        Integer i = Integer.valueOf(1000);
        Integer j = Integer.valueOf(1000);
        System.out.println(i == j);
    }

    private static void example_9() {

    }

    private static void example_10() {

    }
}
