package homeworksJavaPro.homework12_05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TikTacToe {
    private final String you_Won = "You won!";
    private final String aI_Won = "AI won";
    private final String sorry_Draw = "Sorry, draw!";
    private final char char_O = 'o';
    private final char char_X = 'x';
    private final int size = 3;

    private static char [][] table;
    private Random random;
    private String gameOverStatus;
    static Scanner scanner = new Scanner(System.in);
    public TikTacToe(){
        table = new char[size][size];
        random = new Random();
        init();
    }

    private void init(){
        for (int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                table[i][j] = '.';
            }
        }
        gameOverStatus = null;
    }

    public String getGameOverStatus() {
        return gameOverStatus;
    }
    public boolean isGameOver(){
        return gameOverStatus !=null;
    }
    public boolean turn(int x, int y){
        if(isCellValid(x,y)){
            table[y][x]=char_X;
            if (isWin(char_X)){
                gameOverStatus = you_Won;
            }else if(isTableFull()){
                gameOverStatus = sorry_Draw;
            }
            if(gameOverStatus == null){
                turnAI();
                if(isWin(char_O)){
                    gameOverStatus = aI_Won;
                }else if(isTableFull()){
                    gameOverStatus = sorry_Draw;
                }
            }
            return true;
        }
        return false;
    }
    static void turnHuman(){
        int x,y;
        do{
            System.out.println("Enter coordinates x and y [1..3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while(!isCellValid(x,y));
        table[y][x] = 'x';
    }
    private void turnAI(){
        int x, y;
        do{
            x = random.nextInt(size);
            y = random.nextInt(size);
        }while (!isCellValid(x,y));
        table[y][x] = char_O;
    }
    private boolean isTableFull(){
        for(int y = 0; y<size; y++){
            for (int x = 0; x<size;x++){
                if(table[y][x]=='.'){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isWin(char ch){
        for (int i = 0; i<size; i++){
            if(table[i][0]== ch && table[i][1] == ch && table[i][2] == ch) return true;
            if(table[0][i]== ch && table[1][i] == ch && table[2][i] == ch) return true;
        }
        return false;
    }
    private static boolean isCellValid(int x, int y){
        if(x<0 || y<0 || x>2 || y>2){
            return false;
        }
        return table[y][x] == '.';
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y<size; y++){
            for (int x = 0; x<size;x++){
                sb.append(table[y][x] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
