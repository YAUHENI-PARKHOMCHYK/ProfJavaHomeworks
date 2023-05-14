package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
    Cat cat = new Cat(10);
    Plate plate = new Plate(20);
        System.out.println(plate);
//    int food = plate.getFood();
//    plate.setFood(plate.getFood()- cat.getAppetite());
//        cat.eat(plate);
        plate.yammy(cat);
//    plate.decreaseFood(cat.getAppetite());
        System.out.println(cat);
        System.out.println(plate);
    }
}
