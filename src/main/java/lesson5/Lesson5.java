package lesson5;

import java.sql.Array;
import java.util.*;
import java.util.HashMap;

public class Lesson5 {
    static String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur Excepteur sint occaecat cupidatat non proident sunt in culpa qui officia deserunt mollit anim id est laborum";
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2023);
        list.add(2022);
        list.add(2,2022);
        list.add(0,2021);
//        list.remove(1);
        System.out.println(list.get(0));
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        String[] words = text.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));
        Map<Integer, List<String>> app = new HashMap<>();
        app.put(1, Arrays.asList("John", "Joanna"));
        app.put(2, Arrays.asList("Mike", "Bill"));
        app.put(3, Arrays.asList("TJ", "Luke"));

    }
}
