package newTeacher.lesson1.practic;

public class Dishwasher extends BaseTechnique{

    public Dishwasher(int peopleInHome) {
        super(peopleInHome);
    }

    public void draw(){

        System.out.print("Посудомойка "  );
    }
}
