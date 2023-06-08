package newTeacher.lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lesson4 {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Plum");
        fruit.add("Orange");
        fruit.add("Grape");
        fruit.add("Lime");
        fruit.add("Lemon");
        fruit.add("Orange");
        fruit.add("Grape");

//        Iterator<String> fruitIterator = fruit.iterator();
//        while (fruitIterator.hasNext()) {
//            String fruits = fruitIterator.next();
//            System.out.println(fruits);
//        }
//        ListIterator<String> fruitListIt = fruit.listIterator();
//        for (int i = 0; i < 4; i++) {
//            String f = fruitListIt.next();
//            int index = fruitListIt.nextIndex();
//            System.out.println(index + " " +f);
//        }
//        for (int i = 0; i < 3; i++) {
//            String f = fruitListIt.previous();
//            int index = fruitListIt.nextIndex();
//            System.out.println(index + " " +f);
//        }
//        for(String fruits: fruit){
//            System.out.println(fruits);
//        }

//        fruit.forEach(System.out::println);

        fruit.forEach(fruits -> {
            fruits = fruits.toUpperCase();
            System.out.println(fruits);
        });
    }

}
