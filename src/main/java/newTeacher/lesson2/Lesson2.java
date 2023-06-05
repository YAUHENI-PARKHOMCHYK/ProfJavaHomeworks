package newTeacher.lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        Documents[] documents = new Documents[]{new Documents(100, 333),
                new Documents(5, 1000),
                new Documents(777, 9)};
        System.out.println("До сортировки " + Arrays.toString(documents));
        Arrays.sort(documents);
        System.out.println("После сортировки " + Arrays.toString(documents));
        Arrays.sort(documents, new SumComparator());
        System.out.println(Arrays.toString(documents));


        int[] array = new int[]{1, 44, 7, 5, 100};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 44);
        System.out.println(index);


    Car[] cars = new Car[]{new Car(10000, 1300),
            new Car(6000, 1000),
            new Car(15000, 1100)};
    System.out.println("До сортировки "+Arrays.toString(cars));
    Arrays.sort(cars);
    System.out.println("После сортировки " + Arrays.toString(cars));
        Arrays.sort(cars, new Car.MotorComparator());
        System.out.println("После сортировки " + Arrays.toString(cars));
    }

}
