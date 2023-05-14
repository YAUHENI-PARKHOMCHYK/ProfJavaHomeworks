package lesson4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void yammy (Cat cat){
        if(food< cat.getAppetite()){
            System.out.println("There is too low food");
        }else{
            decreaseFood(food);
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