package newTeacher.lesson1;

public class Rectangle extends BaseFigure{

    public Rectangle(int height, int widht) {
        super(height, widht);
    }

    public void draw(){
        System.out.println("Треугольник " + height + " x " + widht );
    }
}
