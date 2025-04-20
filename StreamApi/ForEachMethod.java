import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Demonstrating the forEach method
        System.out.println("Using forEach method:");
        numbers.forEach(number -> System.out.println(number));

        // Explanation of internal implementation:
        // The forEach method is a default method in the Iterable interface.
        // It accepts a Consumer functional interface as an argument.
        // Internally, it iterates over each element of the collection and applies the Consumer's accept() method.

        // Example of using a custom Consumer implementation
        System.out.println("\nUsing a custom Consumer implementation:");
        Consumer<Integer> printConsumer = number -> System.out.println("Number: " + number);
        numbers.forEach(printConsumer);

        // Using method reference with forEach
        System.out.println("\nUsing method reference:");
        numbers.forEach(System.out::println);
        
    }
}