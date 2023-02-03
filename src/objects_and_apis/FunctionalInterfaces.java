package objects_and_apis;

import java.util.function.Function;

public class FunctionalInterfaces {

    /*
    Functional Programming
    a programming style that applies pure function to an input
    set to produce an output
     */

    public static void main(String[] args) {

        Function<Integer, Integer> square = (n) -> n * n;
        Function<Integer, Integer> add = (n) -> n + n;

        square.andThen(add).apply(5); // 50 as the result

    }

    // You're able to create your own functional interfaces
    @FunctionalInterface // recommended to annotate
    // so that java reinforce rule of only 1 abstract method
    public interface MyInterface {
        int add(int num1, int num2, int num3);
    }

}
