import java.util.*;
import java.util.stream.*;

public class IntermediateOperationsDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Alice", "Bob", "Charlie",
                "David", "Alice", "Eve"
        );

        List<String> result =
                names.stream()

                // 1️⃣ filter: keep names longer than 3 characters
                .filter(name -> name.length() > 3)

                // 2️⃣ map: convert each name to uppercase
                .map(String::toUpperCase)

                // 3️⃣ distinct: remove duplicate values
                .distinct()

                // 4️⃣ sorted: sort alphabetically
                .sorted()

                // 5️⃣ peek: print elements for debugging
                .peek(name -> System.out.println("After sort: " + name))

                // 6️⃣ skip: skip first element
                .skip(1)

                // 7️⃣ limit: allow only next 2 elements
                .limit(2)

                // 8️⃣ flatMap: split names into characters
                .flatMap(name -> Arrays.stream(name.split("")))

                // terminal operation (required to trigger execution)
                .collect(Collectors.toList());

        System.out.println("\nFinal Result:");
        System.out.println(result);
    }
}
