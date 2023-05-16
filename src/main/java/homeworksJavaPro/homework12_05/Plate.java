package homeworksJavaPro.homework12_05;

public class Plate {
    private int food;

    public Plate(int food) {
        if(food>=0){
        this.food = food;}else {
            System.out.println("There is cant be negative amount of food");
        }
    }

public void decreaseFood(int food){
        this.food -= food;
}
public void addFood(int food){
        this.food +=food;
}

    public int getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}