package newTeacher.lesson1;

public class Square extends BaseFigure{


    public Square(int height, int widht) {
        super(height, widht);
        if(height!=widht) throw new IllegalArgumentException("Стороны квадрата должны быть равны");
    }

    public void draw(){
        System.out.println("Квадрат " + height + " x " + widht );
    }
}
