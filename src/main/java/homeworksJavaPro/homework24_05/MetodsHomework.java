package homeworksJavaPro.homework24_05;

import java.util.*;

public class MetodsHomework<T> {

    public void swapEnkrements(T src, T gpd, T[]array){

        for(int i = 0; i< array.length; i++){
            if(array[i]==(T)src){
                array[i]=gpd;
            }else if (array[i]==(T)gpd) {
                array[i]=src;
            }
        }

    }
    public void changeToList(T[]arr){
        ArrayList<T> newArray = new ArrayList<>();
        newArray.addAll(List.of(arr));
    }

}
