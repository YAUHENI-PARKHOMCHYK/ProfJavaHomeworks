package homeworksJavaPro.homework10_05_2023;

public class Homework2 {
    static private int sumAnimals;
    static private int cats;
    static private int dogs;

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", "Gray", 3),
                new Dog("Tuzik", "Black", 2),
                new Cat("Kuzya", "White", 5),
                new Dog("Bella", "Brown", 7)};
        for (Animal animal : animals) {
            System.out.println(animal.run(100));
            System.out.println(animal.swim(10));
            sumAnimals = sumAnimals + 1;
            if (animal.who().equals("Cat")) {
                cats = cats + 1;
            } else {
                dogs = dogs + 1;
            }
        }
        System.out.println(sumAnimals + " Animals");
        System.out.println(cats + " Cats");
        System.out.println(dogs + " Dogs");
    }
}
