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

        List<Double> num = new ArrayList<>();
        num.add(2.4);
        num.add(1.3);
        num.add(2.4);
        num.add(1.7);
        num.add(3.4);
        num.add(5.3);
        num.add(4.4);
        num.add(2.1);

        double dir = 0;
        int size = num.size();
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<num.size();j++){
                if(num.get(i)>num.get(j)){
                    dir = num.get(i);
                    num.set(i,num.get(j));
                    num.set(j,dir);
                }
            }
            System.out.println(num.get(i));

        }

    }

}
