package objects_and_apis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithLambdas {

    public static void main(String[] args) {
        printCollection_forEach();
        printMap_forEach();
    }

    public static void printCollection_forEach() {

        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("grape");

        // lambda expression : anonymous block of code that accepts parameters and returns a value
        fruits.forEach(f-> System.out.println(f));
        System.out.println();

        fruits.forEach(System.out::println); // method reference / "class-name" :: "method"
        System.out.println();

        fruits.forEach(f -> {
            f = "fruits : " + f;
            System.out.println(f);
        });

    }

    public static void printMap_forEach() {
        System.out.println();

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 17);
        fruitCalories.put("plum", 25);

        fruitCalories.forEach((k, v) -> System.out.println(k + " : " + v));
    }

}
