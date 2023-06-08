package alogoritms;

public class BinarySirch {
    public static void main(String[] args) {

    }
    public static int search(int number, int [] array, int from, int to){
        if(to<=from){
            return number == array[from] ? from : -1;
        }
        int middle =(from+to)/2;
        if(array[middle]>number){
            return search(number, array, middle+1,to);
        }else {
            return search(number, array, from, middle);
        }
    }
}
