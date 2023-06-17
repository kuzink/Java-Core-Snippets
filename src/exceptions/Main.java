package exceptions;


import java.io.*;

class A {

    public static void method() {
        System.out.println("A.method()");
    }
    public static void method(int a) {
        System.out.println("A.method()" + a);
    }
}

class B extends A {


    public static void method() {
        System.out.println("B.method()");
    }
}

class C {

}


public class Main {

    public static void main(String[] args) {

//        A a = new A();
//        B b = new B();
//        A a1 = new B();

//        a.method();
//        b.method();
//        a1.method();
//        a1.method(6);


        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();    // Id = 1
        bob.displayId();    // Id = 2
        System.out.println(Person.counter); // 3

        // изменяем Person.counter
        Person.counter = 8;

        Person sam = new Person();
        sam.displayId();    // Id = 8
    }

    public final static void m() {
        System.out.println("m()");
    }
}

class Person{

    private int id;
    static int counter=1;

    Person(){
        id = counter++;
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
