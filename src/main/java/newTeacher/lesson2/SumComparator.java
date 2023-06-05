package newTeacher.lesson2;

import java.util.Comparator;

public class SumComparator implements Comparator<Documents> {
    @Override
    public int compare(Documents doc1, Documents doc2) {

        return doc1.number-doc2.number;
    }
}
