package alogoritms;

public class Tower {
    public static void main(String[] args) {
    hanoi(3,"pole 1 ","pole 2 ", "pole 3");
    }
    public static void hanoi(int n, String from, String tmp, String to){
        if(n==1){
            System.out.printf("Перенести из %s, в %s%n ",from, to);
            return;
        }
        hanoi(n-1,from,to,tmp);
        System.out.printf("Перенести из %s, в %s%n ", from, to);
        hanoi(n-1,tmp,from,to);
    }
}
