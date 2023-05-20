package alogoritms.homeworks.homework2;

import java.lang.reflect.Array;
//1.
//2.
//3. Основыне правила: константа отбрасывается,
// оценка сложности 2х функций равна произведению их сложностей,
//
public class TestBubble {
    public static void main(String[] args) {
        int arr []={5,1,7,4,6,32,765,3,54,};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.Sort(arr);
        for(int i =0; i<arr.length;i++){
        System.out.println(arr[i]);}
    }

}
