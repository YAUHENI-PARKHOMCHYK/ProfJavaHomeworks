package alogoritms.homeworks.homework4;

public class Recurs {
    public static int recurs( int n){
        if(n<=1){
            return 1;
        }
        return n * recurs(n-1);
    }
}
