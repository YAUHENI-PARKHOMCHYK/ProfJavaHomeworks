package newTeacher.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {

        List<Documents> docs = new ArrayList();
        docs.add(new Documents(1,"Счет 1"));
        docs.add(new Documents(2,"Счет 2"));
        docs.add(new Documents(3,"Счет 3"));
        Documents doc5 = new Documents(5,"Счет 5");
        docs.add(1,new Documents(4,"Счет 4"));

        docs.remove(0);
//        docs.remove(doc5);
//        docs.clear();
        int doc5Index = docs.indexOf(doc5);
        System.out.println(doc5Index);
    printDocuments(docs);

    }
    static void printDocuments(List<Documents> documents){
        for(int i = 0; i<documents.size(); i++){
           Documents doc = documents.get(i);
            System.out.println(doc);
        }
    }
}
