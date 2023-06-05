package newTeacher.lesson1.practic;


public class Alarm extends BaseTechnique {

    public Alarm(int peopleInHome) {
        super(peopleInHome);
        if(peopleInHome == 0) {
        peopleInHome = 1;
        }

    }

    public void draw(){

        System.out.print("Сигнализация ");
    }
}
