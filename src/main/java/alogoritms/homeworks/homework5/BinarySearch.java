package alogoritms.homeworks.homework5;

public class BinarySearch {
    public void binarySearch(int[] array, int findValue){
        int minIndex = 0;
        int maxIndex = array.length-1;

        for(int i=0; i< array.length; i++){
            int middleValue = (minIndex+maxIndex)/2;
            if(array[middleValue]>findValue){
                maxIndex=middleValue-1;
            }
            if(array[middleValue]<findValue){
                minIndex=middleValue+1;
            }else{
                System.out.println(middleValue);
                break;
            }
        }
    }
}
