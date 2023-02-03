package objects_and_apis;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {

        List<String> vegetable = List.of(
                "peas",
                "cabbage",
                "green beans",
                "spinach",
                "carrots"
        );

        // check to see if there is a vegetable with more than one word
        // anyMatch( predicate operation == boolean)
        vegetable.stream().anyMatch(v -> v.contains(" ")); // true

        // check if elements contain a specific character
        vegetable.stream().allMatch(v -> v.contains("s")); // false

        // narrow elements down that meet a certain condition
        // filter( intermediate operation == returns the resulting string )
        vegetable.stream().filter(v -> v.startsWith("c"))
                .forEach(System.out::println); // "cabbage, carrots"

        // manipulate it's data
        vegetable.stream().map(String::toUpperCase)
                .forEach(System.out::println); // "PEAS, CABBAGE, GREEN BEANS...


        List<Integer> nums = List.of(2, 4, 6, 8, 10);

        // combine sequence of elements into a single value
        nums.stream().reduce(0, (a, b) -> a + b); // result : 30

        // reduce can be used with objects as well such as strings
        vegetable.stream().sorted()
                .reduce("", (a, b) -> a + " | " + b); // | cabbage | carrots | green beans....

        // collect returns data structure of your choice
        List veggiesThatEndWithS = vegetable.stream()
                .filter(v -> v.endsWith("s"))
                .collect(Collectors.toList());

        veggiesThatEndWithS.forEach(System.out::println);

        // chain them together
        vegetable.stream()
                .sorted().filter(v -> v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v -> v.transform(w -> "yummy " + w))
                .collect(Collectors.toList())
                .forEach(System.out::println); // yummy CABBAGE, yummy CARROTS
    }

}
