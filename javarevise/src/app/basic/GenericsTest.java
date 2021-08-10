package basic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<Collection<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayDeque<>());
        System.out.println(list);
    }
}
