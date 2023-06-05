package lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        SimpleBox <Integer>box1 = new SimpleBox<>(5);
        SimpleBox <Integer>box2 = new SimpleBox<>(8);
        SimpleBox <String>box3 = new SimpleBox<>("Box");
//        if(box1.getValue() instanceof Integer && box2.getValue() instanceof Integer) {
            int sum = box1.getValue() + box2.getValue();
            System.out.println(sum);

    }
    static <T> void swaoEkements(int sasd, int fdf, T[]arr ){

    }
}
