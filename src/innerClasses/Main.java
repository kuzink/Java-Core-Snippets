package innerClasses;

public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.Inner inner = outerClass.new Inner();
        OuterClass.Nested nested = new OuterClass.Nested();

        outerClass.methodInOuterClass();
        inner.methodInInnerClass();
        nested.methodInNestedClass();


    }
}
