package Exception;

public class EmptyNameException extends Exception {

    @Override
    public String toString() {
        return "Name cannot be empty!";
    }
}