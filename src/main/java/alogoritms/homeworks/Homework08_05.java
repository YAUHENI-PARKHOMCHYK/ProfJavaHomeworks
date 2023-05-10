package alogoritms.homeworks;

//1.Алгоритм это методы с помощью которых можно решить те или иные задачи.
//2.Основные параметры алгоритма: Должен быть конечным,производить ходя бы один вывод, выводить один и тот же результат при вводе одних и тех же параметров, каждый шаг в алгоритме должен быть эффективным.
//3.Основные способы описания алгоритма: Текстовый, Псевдокод, Графический.

public class Homework08_05 {
    public static void main(String[] args) {
        int[] array = {-50, 49, -32, -54, 42, 76, 32, -23, 54, -12};

        System.out.println(sumPositiveNumbers(array));
        System.out.println(arithmeticMean(array));
        System.out.println(triangleOrNot(5, 7, 9));
        System.out.println(pizzas(1000, 230, 26, 2.5));
    }

    public static int sumPositiveNumbers(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static double arithmeticMean(int arr[]) {
        double midlArith = 0;
        for (int i = 0; i < arr.length; i++) {
            midlArith = midlArith + arr[i];
        }
        return midlArith / arr.length;
    }

    public static boolean triangleOrNot(int a, int b, int c) {
        if (a + b > c && a + c > b && c + b > a) {
            return true;
        }
        return false;
    }

    public static String pizzas(double cash, int pricePizza, int priceGum, double priceCandy) {
        int pizza = 0;
        int gum = 0;
        double candy = 0;
        while (cash > pricePizza) {
            cash = cash - pricePizza;
            pizza = pizza + 1;
        }
        if (cash < pricePizza) {
            while (cash > priceGum) {
                cash = cash - priceGum;
                gum = gum + 1;
            }
        }
        if (cash < priceGum) {
            while (cash > priceCandy) {
                cash = cash - priceCandy;
                candy = candy + 1;
            }
        }

        return ("We can buy " + pizza + (" pizzas, ") + gum + (" gums, ") + candy + (" candes and we will have ") + cash + (" cash"));
    }
}
