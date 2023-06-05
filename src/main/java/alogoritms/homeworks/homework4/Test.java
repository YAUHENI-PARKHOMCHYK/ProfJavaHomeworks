package alogoritms.homeworks.homework4;

import java.util.Arrays;

import static alogoritms.homeworks.homework4.Recurs.recurs;

//1. Рекурсия это когда функция вызывает сама себя.
//2. Линейная структура данных которая следует порядку выполнения операций.
//3. Прямая(вызывает себя), Косвенная(вызывает дополнительную функцию которая вызывает первую функцию), Стоит избегать косвенную.
//4. Когда большое количество повторений рекурсии стоит выбрать итерацию, т.к. итерация не требует дополнительного места в памяти стека.
//5. Базовый случай

public class Test {
    public static void main(String[] args) {
        int fact= 1;
        for(int i = 1; i<=5;i++){
            fact = fact * i;
            System.out.println(fact);
        }

        int factorial = recurs(5);
        System.out.println(factorial);


        int [] array={5,2,9,3,11,7,6};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
