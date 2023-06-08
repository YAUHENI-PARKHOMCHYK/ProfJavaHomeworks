package newTeacher.lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String end = "stop";
        end.toUpperCase();
//        scanner.next()
        int i =0;

        while (!(String.valueOf(scanner).equals(end))){

//        while (scanner.hasNextLine()){
            words.add(String.valueOf(new Words(scanner.next())));
            String upper = String.valueOf(words.get(i));
            words.remove(i);
            words.add(i,upper.toUpperCase());
            System.out.println(words);


            i++;
//            if (scanner.nextLine().equals(end)){
//                break;
//            }
        }

    }

}
