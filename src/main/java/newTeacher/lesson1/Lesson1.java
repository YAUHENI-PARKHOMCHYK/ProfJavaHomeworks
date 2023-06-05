package newTeacher.lesson1;

public class Lesson1 {
    public static void main(String[] args) {



        Square square = new Square(20,20);



        Circle circle = new Circle(5,5);
//        System.out.println("Цвет " + circle.getColor());


        Rectangle rectangle = new Rectangle(8,3);



        Figure[] figures = new Figure[3];
        figures[0] = square;
        figures[1] = circle;
        figures[2] = rectangle;

        for (int i = 0; i<figures.length; i++){
            BaseFigure figure = (BaseFigure) figures[i];
            figure.draw();
            System.out.println("Цвет " + figure.getColor());
        }

    }
}
