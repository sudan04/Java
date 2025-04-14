
import java.util.Arrays;


class CustomArrListWithoutGenerics{
    private int[] data;
    private static int default_size= 10;
    private int size=0;

    public CustomArrListWithoutGenerics(){
        data= new int[5];
    }

    public void add(int value){
        if(isFull()){
            resize();
        }
        data[size++]= value;
    }

    private void resize() {
        int[] temp= new int[data.length*2];

        System.arraycopy(data, 0, temp, 0, data.length);
        data= temp;
        
    }

    public boolean isFull(){
        return data.length== size;
    }

    public int remove(int index){
        int removed= data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return this.size;
    }

    public void set(int index, int value){
        data[index]= value;
    }

    @Override
    public String toString() {
        return "{Data: "+ Arrays.toString(Arrays.copyOf(data, size))+ ",Size: "+size+"}";
    }
}

class CustomArrListGenerics<T>{
    private Object[] data;
    private static int default_size= 10;
    private int size=0;

    public CustomArrListGenerics(){
        data= new Object[5];
    }

    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++]= value;
    }

    private void resize() {
        Object[] temp= new Object[data.length*2];

        System.arraycopy(data, 0, temp, 0, data.length);
        data= temp;
        
    }

    public boolean isFull(){
        return data.length== size;
    }

    public T remove(int index){
        T removed= (T) data[--size];
        return removed;
    }

    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return this.size;
    }

    public void set(int index, T value){
        data[index]= value;
    }

    @Override
    public String toString() {
        return "{Data: "+ Arrays.toString(Arrays.copyOf(data, size))+ ",Size: "+size+"}";
    }
}
public class CustomArrListExample {
    public static void main(String[] args) {
        CustomArrListGenerics<Integer> arrList= new CustomArrListGenerics<>();
        arrList.add(3);
        arrList.add(34);
        arrList.add(334);
        arrList.add(3);
        arrList.add(34);
        arrList.add(334);
        System.out.println(arrList);
    }
}
