package alogoritms.homeworks.homework5;

public class Rec {
    public static int recur( int x, int n){
        if(n<=0){
            return 1;
        }
        return x * recur(x,n-1);
    }
}
