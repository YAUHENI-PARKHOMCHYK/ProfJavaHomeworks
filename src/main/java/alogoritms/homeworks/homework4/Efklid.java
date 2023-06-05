package alogoritms.homeworks.homework4;

public class Efklid {

    public static int evklid(int a, int b) {
            if (b == 0)
                return a;
            else
                return evklid (b, a % b);

    }


    public static void main(String[] args) {
        int omg = evklid(300,120);
        System.out.println(omg);
    }
}
