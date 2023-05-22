package alogoritms.homeworks.homework2;

import java.lang.reflect.Array;
//1. Эфективность алгоритма оценивается количеством элементарных операций
//2. Как быстро увеличивается время работы алгоритма с увеличением объёма данных.
//3. Основыне правила: константа отбрасывается,
// оценка сложности 2х функций равна произведению их сложностей, оценка сложностей суммы функций.
//4. O(1), O(n),O(n^2),O(n^10),O(log(n)),O(n*log(n))
//5. O(n^3)
//6. O(n^2)
//7. O(n)

// Второй уровень:
//1. O(n)
public class TestBubble {
    public static void main(String[] args) {
        int arr []={5,1,7,4,6,32,765,3,54,};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.Sort(arr);
        for(int i =0; i<arr.length;i++){
        System.out.println(arr[i]);}
    }

}
