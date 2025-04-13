public class Main{
    public static void main(String[] args) {
        // Box<Integer> b= new Box<>(34);
        // System.out.println(b.getValue());

        Pair<String, Integer> pair= new Pair<>("Age", 20);

        System.out.println(pair.getKey()+" "+pair.getValue());
    }
}