package newTeacher.lesson2;

import java.util.Comparator;

public class MotorComparator implements Comparator<Car> {
    @Override
    public int compare(Car doc1, Car doc2) {

        return doc1.price - doc2.price;
    }
}
