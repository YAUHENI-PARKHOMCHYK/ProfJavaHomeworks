package lesson7;

public class RubberArray <E>{
    private Object[] array;

    public RubberArray(){
        array = new Object [0];
    }
    public void add(int value){
        Object[] newArray = new Object[array.length+1];
        System.arraycopy(array,0,newArray,0,array.length);
        newArray[array.length] = value;
        array = newArray;
    }
    public void add(int index, int value){
        Object[] newArray = new Object[array.length+1];
        System.arraycopy(array,0,newArray,0,index);
        System.arraycopy(array,index,newArray,index+1,array.length-(index));
        newArray[index] = value;
        array =  newArray;
    }
    public void remove(int index){
        Object[] newArray = new Object[array.length-1];
        System.arraycopy(array,0,newArray,0,index);
        System.arraycopy(array,index+1,newArray,index,array.length - (index+1));
        array = newArray;
    }
    public E get(int index){
    return (E) array[index];
    }
    public Object indexOf(int value){
        for(int i = 0; i<array.length; i++){
            if(array[i].equals(value)){
                return i;
            }
        }
        return ("didn't find value " + value);
    }
    public boolean contains(int value){
        for(int i = 0; i<array.length;i++)
            if(array[i].equals(value))
                return true;
        return false;
    }
    public int size(){
        return array.length;
    }
    public boolean isEmpty(){
        for (int i = 0; i<array.length; i++)
            if(array[i].equals(0))
                return false;
        return true;
    }
    public void addAll(int... value) {
        Object[] newArray = new Object[array.length + value.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        int indexForValue;
        indexForValue = array.length;
        for (int i = 0; i < value.length; i++) {
            newArray[indexForValue] = value[i];
            indexForValue++;
        }
        array = newArray;
    }
    public void addAall(int index, int... value){
        Object[] newArray = new Object[array.length + value.length];
        System.arraycopy(array,0,newArray,0,index);
        int newIndex;
        newIndex = index;
        for(int i = 0; i< value.length; i++){
            newArray[newIndex] = value[i];
            newIndex++;}
        System.arraycopy(array,index,newArray,index+value.length,array.length-index);
        array=newArray;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for(int i = 0; i<array.length; i++){
            stringBuffer.append(array[i]);
            if(i<array.length -1){
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.append("]").toString();
    }
}
