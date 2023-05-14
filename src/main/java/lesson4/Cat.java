package lesson4;

public class Cat {
    private final int appetite;
    private boolean fullness; //если сытый то не ест
    public Cat(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }
    public void eat(Plate plate){
        plate.decreaseFood(appetite);
    }

//    public void yammy (Plate plate){
//        if(plate.getFood() < getAppetite()){
//            System.out.println("There is too low food");
//        }else{
//            plate.decreaseFood(plate.getFood());
//        }
//    }
    @Override
    public String toString() {
        return "Cat{" +
                "appetite=" + appetite +
                '}';
    }
}
