import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 3, 5, 2, 1);

        System.out.println("🔹 Even Numbers:");
        List<Integer> evenNumbers = list.stream()
                                        .filter(n -> n % 2 == 0)
                                        .toList();
        System.out.println(evenNumbers);

        System.out.println("\n🔹 Sorted List:");
        List<Integer> sortedList = list.stream()
                                       .sorted()
                                       .toList();
        System.out.println(sortedList);

        System.out.println("\n🔹 Doubled Values:");
        List<Integer> doubledValues = list.stream()
                                          .map(n -> n * 2)
                                          .toList();
        System.out.println(doubledValues);

        System.out.println("\n🔹 Original List (using forEach):");
        list.stream().forEach(n -> System.out.print(n + " "));
        
        System.out.println("\n\n🔹 One-liner: Odd → Sorted → Doubled → Printed");
        list.stream()
            .filter(n -> n % 2 == 1)     // keep odd
            .sorted()                   // sort them
            .map(n -> n * 2)            // double each elements 
            .forEach(n -> System.out.print(n + " "));

        // 📝 ----------------------------------------------
        // 🧠 Notes 
        
        /*
        🔍 What is a Stream?
        - A Stream is a sequence of elements supporting functional-style operations.
        - It does NOT store data. It works on data from collections (like List).

        ⚙️ Stream Operations:
        1. Intermediate Operations (lazy, return a new stream):
           - filter(), map(), sorted(), distinct(), limit(), skip(), etc.
           - These define steps but DO NOT execute them immediately.

        2. Terminal Operations (trigger the pipeline, produce result or side-effect):
           - forEach(), toList(), collect(), reduce(), count(), etc.
           - These cause the whole chain to run.

        ❗️"Triggering the pipeline":
           - Until a terminal operation is used, intermediate ops won’t run.
           - The pipeline is only executed when a terminal operation is called.

        ✅ When to Use Streams:
        - When performing data transformations (filter, map, etc.)
        - When you want clean, readable, and functional-style code

        ❌ When NOT to Use Streams:
        - When you need to modify the original list
        - When you need index-based access (use traditional loops)
        - For overly complex logic where readability suffers

        💡 Streams are SINGLE-USE. Once consumed by a terminal op, they cannot be reused.
        */
    }
}
