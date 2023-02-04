package objects_and_apis;

public class NegativeInputException extends Exception{

    public NegativeInputException() {
        this("input must be greater than or equal to 0");
    }

    public NegativeInputException(String message) {
        super(message);
    }

}
