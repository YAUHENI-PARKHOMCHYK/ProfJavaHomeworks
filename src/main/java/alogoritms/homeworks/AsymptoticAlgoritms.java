package alogoritms.homeworks;

public class AsymptoticAlgoritms {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        for(int i = 0; i<n;i++){
        sum += i;
        }
        System.out.println(sum);
    }
    public static void constantAlgorithm(){
        int paramOne = 2;
        int paramTwo = 67;
        int sum = paramOne + paramTwo;// O(1)
    }
}
