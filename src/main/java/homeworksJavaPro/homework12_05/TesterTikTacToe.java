package homeworksJavaPro.homework12_05;

import java.util.Random;
import java.util.Scanner;

public class TesterTikTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TikTacToe game = new TikTacToe();
        while (!game.isGameOver()){
            System.out.println("Enter coordinates x and y [1..3]: ");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            game.turn(x, y);
            System.out.println(game);
        }
        System.out.println(game.getGameOverStatus());
    }
}
