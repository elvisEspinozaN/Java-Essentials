package objects_and_apis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RethrowingExceptions {

    /*
    create a new file on your file system
    do not catch any exceptions that may occur
    multiple options with dealing with exceptions
     */

    public static void main(String[] args) throws IOException {
        rethrowException();
    }

    public static void rethrowException() throws IOException {
        File file = new File("nonExistent/file.txt");
        file.createNewFile();

        Scanner fileReader = new Scanner(file);
    }


}
