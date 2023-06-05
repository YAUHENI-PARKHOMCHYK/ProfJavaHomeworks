package newTeacher.lesson1;

public class Elipse extends BaseFigure{

    public Elipse(int height, int widht) {
        super(height, widht);
    }

    public void draw(){
        System.out.println("Овал " + height + " x " + widht );
    }
}
