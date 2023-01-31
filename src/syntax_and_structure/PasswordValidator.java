package syntax_and_structure;

import java.util.Scanner;

public class PasswordValidator {
    /*
    Given :
    Username - johndoe
    Password - ABC_1234

    Ask the User to Provide :
    New password

    Verify :
    At least eight characters long
    Contains an uppercase letter
    Contains a special character
    Does not contain the username (johndoe)
    is not the same as the old password (ABC_1234)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid;

        System.out.println(newPasswordInstructions());

        do {
            System.out.println("Enter your new password :");
            String newPassword = sc.nextLine();
            valid = validator(newPassword);
        } while(!valid);

        System.out.println("Successful!");


    }

    private static boolean validator(String newPassword) {

        boolean valid =  true;
        String errMsg = "";
        String username = "johndoe";
        String currentPassword = "ABC_1234";

        if(newPassword.equalsIgnoreCase(currentPassword)) {
            valid = false;
            errMsg += "\n Your password cannot match your previous password.";
        }

        if(newPassword.length() < 8) {
            valid = false;
            errMsg += "\n Your password must be at least 8 characters long";
        }

        if(newPassword.matches("[a-zA-Z0-9]*")) {
            valid = false;
            errMsg += "\n Your password must have special characters";
        }

        if(newPassword.equalsIgnoreCase(username)) {
            valid = false;
            errMsg += "\n Your password must not be the same as your username.";
        }

        if(newPassword.equals(newPassword.toLowerCase())) {
            valid = false;
            errMsg += "\n Your password must contain an uppercase letter.";
        }

        if(!valid) {
            System.out.println(errMsg);
        }

        return valid;

    }

    private static String newPasswordInstructions() {
        return """
                To change password, make sure its:
                At least eight characters long
                Contains an uppercase letter
                Contains a special character
                Does not contain the username
                Is not the same as the old password
                """;
    }


}
