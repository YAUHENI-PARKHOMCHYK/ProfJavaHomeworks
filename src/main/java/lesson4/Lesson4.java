package lesson4;

import java.lang.reflect.Array;

public class Lesson4 {
    public static void main(String[] args) {
    Plate plate = new Plate(30);
        Cat cat [] = {new Cat(15),
        new Cat(10),
        new Cat(12),
        new Cat(10)};

        System.out.println(plate);
        for(int i = 0; i<cat.length; i++) {
            cat[i].eat(plate);
            System.out.println(cat[i]);
            System.out.println(plate);
        }
    }
}
