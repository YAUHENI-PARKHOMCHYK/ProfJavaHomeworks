package newTeacher.lesson4;

import java.util.*;

public class Practic {
    public static void main(String[] args) {
        List<String > words = new ArrayList<>();
        words.add("World");
        words.add("Man");
        words.add("Great");
        words.add("Woman");
        words.add("Girl");
        words.add("Boy");
        ListIterator<String > word = words.listIterator();
        while (word.hasNext()){
            String f = word.next();
        }
        while (word.hasPrevious()){
            String prew = word.previous();
            System.out.println(prew);
        }
        int x = 5;
        int y = 10;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(15);
        numbers.add(13);
        Iterator<Integer> numbersIt = numbers.iterator();
        while(numbersIt.hasNext()){
            int g = numbersIt.next();
            if(g>=x && g<=y){
                numbersIt.remove();
            }
        }
        numbers.forEach(System.out::println);

    }

}
