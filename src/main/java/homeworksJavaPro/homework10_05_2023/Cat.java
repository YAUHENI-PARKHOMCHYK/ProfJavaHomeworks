package homeworksJavaPro.homework10_05_2023;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public String who() {
        return "Cat";
    }

    public String swim(int swimMeters) {
        return ("Cat cant swims ") + (swimMeters) + (" meters because cats do not swim");
    }

    @Override
    public String run(int runMeters) {
        if (runMeters <= 200) {
            return ("Cat runs ") + (runMeters) + (" meters");
        } else {
            return ("Cat does not run ") + (runMeters) + (" meters");
        }
    }
}
