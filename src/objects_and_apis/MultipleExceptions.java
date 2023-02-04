package objects_and_apis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("files/numbers.txt");
        File outputFile = new File(("files/output.txt"));

        /*
        try-with-resources : declaration of resources that should be automatically
        closed after the execution of a try block
        can use several parameters
        resources are closed in the reverse order they were defined
         */
        try(
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile)
        ) { // initialize the resource
            while(fileReader.hasNext()) {
                fileWriter.println(fileReader.nextDouble());
            }
        } catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
        // this won't be needed
//        finally { // execute no matter what happen with the try or catch
//            fileReader.close();
//        }

    }
}
