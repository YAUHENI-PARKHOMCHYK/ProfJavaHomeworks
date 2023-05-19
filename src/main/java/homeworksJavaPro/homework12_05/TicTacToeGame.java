package homeworksJavaPro.homework12_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeGame extends JFrame {
    public static void main(String[] args) {
        new TicTacToeGame();

    }
    public TicTacToeGame(){
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        add(canvas);
        canvas.setPreferredSize(new Dimension(600,600));
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getX()+ ":" + e.getY());
                int x = e.getX() / 200;
                int y = e.getY() / 200;
                System.out.println(x + ":" + y);
            }
        });
        setVisible(true);
    }
    class Canvas extends JPanel{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.lightGray);
            for(int i = 0; i<2;i++){
                g.drawLine(200,0,200,600);
                g.drawLine(400,0,400,600);
                g.drawLine(0,200,600,200);
                g.drawLine(0,400,600,400);
            }
        }
    }
}
