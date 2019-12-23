package basic;

class Father {
    String name = "father";
    public void test() {
        System.out.println("hello");
    }
}

class Child extends Father{
    String name = "child";
}

public class DownCasting {
    public static void main(String[] args) {
        Father f = new Father();
        Father c = new Child();
        System.out.println(f instanceof Child);
    }
}