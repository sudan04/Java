
import java.util.Arrays;


class CustomArrList{
    private int[] data;
    private static int default_size= 10;
    private int size=0;

    public CustomArrList(){
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

public class CustomArrListExample {
    public static void main(String[] args) {
        CustomArrList arrList= new CustomArrList();
        arrList.add(3);
        arrList.add(34);
        arrList.add(334);
        arrList.add(3);
        arrList.add(34);
        arrList.add(334);
        System.out.println(arrList);
    }
}
