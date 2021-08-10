package basic;

class FatherTestClass {
    public static void test() {
        System.out.println("test");
    }
}
public class StaticAndNonWSameName extends FatherTestClass {
    public void test() {
        System.out.println("test");
    }
}