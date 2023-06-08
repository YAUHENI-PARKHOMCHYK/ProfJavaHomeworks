package newTeacher.homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Type book = Type.BOOK;
        Type magazine = Type.MAGAZINE;
        ArrayList<Books>books = new ArrayList<>();
        books.add(new Books("War and peace",123423,300,4));
        books.add(new Books("Heidi",123423,100,4));
        books.add(new Books("The Secret Garden",123423,120,4));
        books.add(new Books("The Invisible Man",123423,220,2));


//        Books warAndPeace = new Books("War and peace",123423,300,4);
//        Books heidi = new Books("Heidi",123423,100,4);
//        Books theSecretGarden = new Books("The Secret Garden",123423,120,4);
//        Books theInvisibleMan = new Books("The Invisible Man",123423,220,2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ниже что вас интересует: ");
        String scan = scanner.nextLine();
        System.out.println(books);
        if(String.valueOf(scan).equals(book)){
            System.out.println(books);
        }
    }

}
