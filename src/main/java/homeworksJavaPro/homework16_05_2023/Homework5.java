package homeworksJavaPro.homework16_05_2023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * JavaPro.Homework #4
 *
 * @author Parkhomchyk Yauheni
 * @version 12 May 2023
 */
// Не знаю какой из вариантов был нужен, сделал три!
public class Homework5 {
    static String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur Excepteur sint occaecat cupidatat non proident sunt in culpa qui officia deserunt mollit anim id est laborum";

    public static void main(String[] args) {
        String[] words = text.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));
        int howMuchRepetitiveWords = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j]) && i != j) {
                    howMuchRepetitiveWords++;
                }
            }
        }
        System.out.println(howMuchRepetitiveWords);
        Set<String> set = new HashSet<>(List.of(words));
        System.out.println(set);
    }
}
