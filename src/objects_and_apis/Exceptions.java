package objects_and_apis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    /*
    Exception
    an error event that disrupts the normal flow of the program
    checked exception : exceptions verified by the compiler / recovery is possible
    unchecked exception : not verified by the compiler / nothing to do

    Multiple Exceptions
    ways to handle multiple exceptions :
    polymorphism, series of catch blocks and one multiple catch block
     */

    public static void main(String[] args) {

        // create a non-existent file, handle the error
        File file = new File("non/existent.txt");
        try {
            file.createNewFile(); // IOException

        } catch(IOException e) {
            // display the error message
            System.out.println("Sorry an error has occurred : " + e.getMessage());
            // stack trace : interactive log of method calls that led to thrown exception
            e.printStackTrace(); // common practice

        }

    }

}



