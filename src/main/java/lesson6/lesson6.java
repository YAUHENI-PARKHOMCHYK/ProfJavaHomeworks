package lesson6;

import homeworksJavaPro.homework19_05_2023.RubberArray;

import java.util.ArrayList;
import java.util.List;

public class lesson6 {

        public static void main(String[] args) {
            List<Integer> intList = new ArrayList<>();
            System.out.println(intList);
            intList.add(8);
            intList.add(17);
            intList.add(5);
            System.out.println(intList);
            System.out.println(intList.get(1));
            intList.remove(1);
            System.out.println(intList);
            System.out.println("------------");

            RubberArray rubberArray = new RubberArray();
            System.out.println(rubberArray);
            rubberArray.add(8);
            rubberArray.add(17);
            rubberArray.add(5);
            System.out.println(rubberArray);
            System.out.println(rubberArray.get(1));
            rubberArray.remove(1);
            System.out.println(rubberArray);
            rubberArray.add(1,6);
            System.out.println(rubberArray);
            System.out.println(rubberArray.indexOf(7));
            System.out.println(rubberArray.size());
            System.out.println(rubberArray.contains(7));
            System.out.println(rubberArray.isEmpty());
            rubberArray.addAll(23,44,55,654,4332);
            System.out.println(rubberArray);
            rubberArray.addAall(4,12,22,33,21,11,32,222,333,6666,453);
            System.out.println(rubberArray);
        }

}
