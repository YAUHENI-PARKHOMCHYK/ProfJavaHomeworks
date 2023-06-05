package newTeacher.lesson1;

import java.util.Random;

public class Circle extends BaseFigure{


    public Circle(int height, int widht) {
        super(height, widht);
        if(height!=widht) throw new IllegalArgumentException("Стороны круга должны быть равны");
    }

    public void draw(){
        System.out.println("Круг " + height + " x " + widht );
    }

}
