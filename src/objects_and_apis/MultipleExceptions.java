package objects_and_apis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNext()) {
                System.out.println(fileReader.hasNextDouble()); // nextDouble method has unchecked exception
            }
        } catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
