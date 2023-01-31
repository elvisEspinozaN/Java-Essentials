package syntax_and_structure;

import java.util.Locale;
import java.util.Scanner;

public class SwitchExpressions {

    public static void main(String[] args) {
        /*
        switch expression : much simpler than a switch statement
        and best when you need to assign a value
        switch statement : when you need to invoke statements
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade letter : ");
        String grade = sc.next().toUpperCase(Locale.ROOT);

        String message = switch(grade) {
            case "A" -> "Excellent";
            case "B", "C" -> "Good";
            case "D" -> "Work harder";
            case "F" -> "Failed";
            default -> "Enter a valid letter grade";
        };

        System.out.println(message);
        System.out.println();

        // multiple statement in Switch Expression :

        System.out.println("Input 2 digits :");
        float firstNumber = sc.nextFloat();
        float secondNumber = sc.nextFloat();

        System.out.println("What arithmetic operation do you want? \n + or - : ");
        String operation = sc.next();
        sc.close();

        float result = switch(operation) {
            case "+" -> {
                System.out.println("Adding...");
                yield firstNumber + secondNumber;
            }
            case "-" -> {
                System.out.println("Subtracting...");
                yield firstNumber - secondNumber;
            }
            default -> 0;
        };

        System.out.println(result);

    }

}
