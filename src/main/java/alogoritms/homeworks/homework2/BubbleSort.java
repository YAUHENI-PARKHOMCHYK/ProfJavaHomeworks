package alogoritms.homeworks.homework2;

public class BubbleSort {

    public void Sort(int arr[]){
        int dataBase = 0;
    for(int i =0; i< arr.length;i++){
        for(int j = 0; j<arr.length;j++){
        if(arr[i]<arr[j]) {
            dataBase = arr[j];
            arr[j] = arr[i];
            arr[i] = dataBase;
        }
        }

    }
    }
}
