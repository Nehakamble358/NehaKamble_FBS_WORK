package Exception;

public class InvalideParsentageException extends Exception {

    public InvalideParsentageException() {
        super("Invalid percentage! Value must be between 0 and 100.");
    }
}