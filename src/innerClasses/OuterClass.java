package innerClasses;

public class OuterClass {

    private String outerName= "outerName";
    private static String outerNameStatic = "outerNameStatic";

    class Inner {
        private String innerName = "innerName";
        //private static String innerNameStatic = "innerNameStatic";  -> Will be Compilation Error

        public void methodInInnerClass() {
            System.out.println("2. methodInInnerClass():");

            System.out.println(outerName);
            System.out.println(outerNameStatic);
        }
    }

    static class Nested {
        private String nestedName = "nestedName";
        private static String nestedNameStatic = "nestedNameStatic";


        public void methodInNestedClass() {
            System.out.println("3. methodInNestedClass():");

            //System.out.println(outerName); -> Will be Compilation Error
            System.out.println(new OuterClass().outerName);
            System.out.println(outerNameStatic);
        }
    }

    public void methodInOuterClass() {
        System.out.println("1. methodInOuterClass()");

        Nested nested = new Nested();
        System.out.println(nested.nestedName);

        Inner inner = new Inner();
        System.out.println(inner.innerName);
    }
}
