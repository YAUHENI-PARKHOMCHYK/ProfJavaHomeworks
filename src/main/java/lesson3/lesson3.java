package lesson3;



public class lesson3 {
    public static void main(String[] args) {
        Animal [] animals = {new Cat("Barsik","Black",3),new Dog("Tuzik","Black",3)};
//        Cat cat = new Cat("Barsik","Black",3);
//        Dog dog = new Dog("Tuzik","Black",3);
//         System.out.println(cat.voice());
//         System.out.println(cat);
//         System.out.println("Name: " + cat);
//
//        System.out.println(dog.voice());
//        System.out.println(dog);
//        System.out.println("Name: " + dog);
    for(Animal animal:animals){
        System.out.println(animal.voice());
        System.out.println(animal);
    }




    }
}
