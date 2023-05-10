package homeworksJavaPro.homework10_05_2023;

public class Dog extends Animal {


    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public String who() {
        return "Dog";
    }

    public String swim(int swimMeters) {
        if (swimMeters <= 10) {
            return ("Dog swims ") + (swimMeters) + (" meters");
        } else {
            return ("Dog does not swim ") + (swimMeters) + (" meters");
        }
    }

    @Override
    public String run(int runMeters) {
        if (runMeters <= 200) {
            return ("Dog runs ") + (runMeters) + (" meters");
        } else {
            return ("Dog does not run ") + (runMeters) + (" meters");
        }
    }
}
