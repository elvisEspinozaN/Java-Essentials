package objects_and_apis;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        // no duplicate items in the set
        // unordered : any type of opbject
        Set fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");

        System.out.println(fruits);

        System.out.println("have apples? "
                + fruits.contains("apple"));

        fruits.remove("apple");

        System.out.println("Number of elements after removing apple : "
                + fruits.size());

        // static method "of()" : Set becomes an immutable object
        Set moreFruit = Set.of("raisin", "cherry", "mango"); // easier way to add to sets
        System.out.println(moreFruit);

    }

}
