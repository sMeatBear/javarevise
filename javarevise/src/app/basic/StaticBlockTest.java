package basic;

public class StaticBlockTest {
    public static String test;

    static {
        test = "static block";
        System.out.println(test);
    }

    {
        System.out.println("common block");
    }

    public static void main(String[] args) {
        StaticBlockTest s = new StaticBlockTest();
    }
}
