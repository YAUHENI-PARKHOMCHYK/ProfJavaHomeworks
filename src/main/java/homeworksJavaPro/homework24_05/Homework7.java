package homeworksJavaPro.homework24_05;

import java.util.Arrays;

public class Homework7{
    public static void main(String[] args) {

        Integer[] arr = {2, 4, 5, 3, 6};
        String [] array = {"Bob","Max","Den","Nikola"};
        MetodsHomework<Integer> metodsHomework = new MetodsHomework<>();
        MetodsHomework<String> metodsHomework1 = new MetodsHomework<>();
        metodsHomework.swapEnkrements(2,5,arr);
        metodsHomework1.swapEnkrements("Max","Nikola",array);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        metodsHomework.changeToList(arr);
    }




}
