package string;

public class Test_1 {

    {
        System.out.println("логический блок");
    }

    static {
        System.out.println("статический блок");
    }

    public Test_1() {
        System.out.println("констуктор");
    }

    public void m_1() {
        System.out.println("m_1");
    }

    public void m_1(String str) {
        System.out.println("m_1");
    }
}
