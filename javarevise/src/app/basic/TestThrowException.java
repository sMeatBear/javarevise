package basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestThrowException {
    public static int throwExcepionInCommonFlow(int flag) throws Exception {
        System.out.println("method call. before throwing exception");
        if (flag == 0) {
            throw new Exception("It's been thrown");
        }
        System.out.println("method call. After throwing exception");
        return flag;
    }

    public static void main(String[] args) throws Exception {
        try {
            File f = new File("test");
            // BufferedReader br = new BufferedReader(new FileReader(f));
            throwExcepionInCommonFlow(0);
        } catch (Exception e) {
            // test if can reach finally module
            System.out.println("Exception accessed");
            return;
        } finally {
            System.out.println("Finally done.");
        }
    }
}
