package alogoritms;

public class Sorts {
    public static void main(String[] args) {
        int sum =0;
        for(int i =0; i <= 10; i ++) {
            sum +=i;
        }
        System.out.println(sum);

    }

//    for(int i =10; i >= 0; i --) {
//    }
//    }
    public static int recFunction(int n) {
        if (n <= 0) {
            return 0;
        }
        System.out.println(n);
        recFunction(n - 1);
    return 0;
    }
}
