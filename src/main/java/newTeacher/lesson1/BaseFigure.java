package newTeacher.lesson1;

import java.util.Random;

public abstract class BaseFigure implements Figure {
    int height;
    int widht;
    private int color;

    public BaseFigure(int height, int widht) {
        this.height = height;
        this.widht = widht;

        this.color = new Random().nextInt(7);
    }

    public int getColor() {
        return color;
    }

    @Override
    public abstract void draw();
}
