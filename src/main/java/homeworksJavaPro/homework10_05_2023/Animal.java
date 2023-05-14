package homeworksJavaPro.homework10_05_2023;


public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract String who();

    public abstract String run(int runMeters);

    public abstract String swim(int swimMeters);


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
