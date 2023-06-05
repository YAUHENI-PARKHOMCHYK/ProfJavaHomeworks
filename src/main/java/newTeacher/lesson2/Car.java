package newTeacher.lesson2;

import java.util.Comparator;

public class Car implements Comparable<Car>, Motor {
    int price;
    int motor;


    static class MotorComparator implements Comparator<Car> {
        @Override
        public int compare(Car doc1, Car doc2) {
            return doc1.motor - doc2.motor;
        }
    }



    public Car(int price, int motor) {
        this.price = price;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", motor=" + motor +
                '}';
    }

    @Override
    public int compareTo(Car doc) {
        if(this.price>doc.price) return 1;
        if(this.price==doc.price) return 0;
        if(this.price<doc.price) return -1;
        return 0;
    }
}
