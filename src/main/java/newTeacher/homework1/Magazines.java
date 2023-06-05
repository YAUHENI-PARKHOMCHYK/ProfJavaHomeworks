package newTeacher.homework1;

public class Magazines extends Library{

    private String magazineName;
    private String userName;
    private int price;
    private int yearMagazine;
    private int numberMagazine;

    public Magazines(String magazineName, String userName, int price, int yearMagazine, int numberMagazine) {
        this.magazineName = magazineName;
        this.userName = userName;
        this.price = price;
        this.yearMagazine = yearMagazine;
        this.numberMagazine = numberMagazine;
    }
    public void draw(){
        if(price >= 1000){
            System.out.println("Извините мы не можем выдать вам " + magazineName + "стоимостью " + price);
        }
        System.out.println("Журнал " + magazineName +"год выпуска" + yearMagazine + "номер журнала " + numberMagazine);
    }
}
