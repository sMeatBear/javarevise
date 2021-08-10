package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetViewTest {
    public static void main(String[] args) {
        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            alphabet.put((char) ('a' + i), i + 1);
        }
        System.out.println(alphabet);
        Set<Character> setView = alphabet.keySet();
        System.out.println(setView);
        // try to change set view
        setView.remove('b');
        System.out.println(setView);
        System.out.println(alphabet);
     }
}
