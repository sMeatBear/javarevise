package basic;

class FatherTestClass {
    public static void test() {
        System.out.println("test");
    }
}
public class StaticAndNonWSameName extends FatherTestClass {
    public static void test() {
        System.out.println("test");
    }
}