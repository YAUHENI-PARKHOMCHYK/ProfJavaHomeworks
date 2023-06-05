package alogoritms.homeworks.homework4;

public class SelectionSort {
    public void selectionSort(int[]arr){
        int dir = 0;
        for (int i = 0; i< arr.length; i++){
            int minValueIndex= i;
            for(int j = i+1; j< arr.length ; j++){
                if(arr[j]<arr[minValueIndex]){
                    minValueIndex=j;
                }
            }
            dir=arr[i];
            arr[i]=arr[minValueIndex];
            arr[minValueIndex]=dir;
        }

    }
}
