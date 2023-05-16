package homeworksJavaPro.homework12_05;

public class Cat {
    private final int appetite;
    private boolean fullness; //если сытый то не ест
    public Cat(int appetite) {
        this.appetite = appetite;
    }
    public int getAppetite() {
        return appetite;
    }
//    public void eat(Plate plate){
//        plate.decreaseFood(appetite);
//    }

    public void eat (Plate plate){
        if(fullness == false) {
            if (plate.getFood() < getAppetite()) {
                System.out.println("There is too low food");
                fullness = false;
            } else {
                plate.decreaseFood(appetite);
                fullness = true;
            }
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "appetite=" + appetite +
                ", fullness=" + fullness +
                '}';
    }
}
