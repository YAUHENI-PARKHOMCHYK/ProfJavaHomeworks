package newTeacher.homework1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        String userName;

        String book = "BOOK";
        String magazine = "MAGAZINE";
        ArrayList<Books>books = new ArrayList<>();
        ArrayList<Magazines>magazines = new ArrayList<>();
        books.add(new Books("War and peace",123423,300,4));
        books.add(new Books("Heidi",123423,100,4));
        books.add(new Books("The Secret Garden",123423,120,4));
        books.add(new Books("The Invisible Man",123423,220,2));
        ListIterator<Books> bookUsers = books.listIterator();
        magazines.add(new Magazines("The Time",100,2000,4));
        magazines.add(new Magazines("The Guardian",80,2010,1));
        magazines.add(new Magazines("The Daily Mail",120,2020,6));
        magazines.add(new Magazines("The Economist",100,2000,4));

        ListIterator<Magazines> magazineUser = magazines.listIterator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ниже что вас интересует: ");
        String scan = scanner.nextLine();
        String choice = scan.toUpperCase();
        if(choice.equals(book)) {
            while (bookUsers.hasNext()) {
                Books f = bookUsers.next();
                System.out.println(f);
            }
        }
            if(choice.equals(magazine)){
                while (magazineUser.hasNext()){
                    Magazines x = magazineUser.next();
                    System.out.println(x);
                }
            }
        String nextScan = scanner.nextLine();
        String enter = scan.toUpperCase();

//        Books warAndPeace = new Books("War and peace",123423,300,4);
//        Books heidi = new Books("Heidi",123423,100,4);
//        Books theSecretGarden = new Books("The Secret Garden",123423,120,4);
//        Books theInvisibleMan = new Books("The Invisible Man",123423,220,2);

//        if(String.valueOf(scan).equals(book)){
//            for(int i = 0; i< books.size();i++){
//            System.out.println(books);}
//        }
    }

}
