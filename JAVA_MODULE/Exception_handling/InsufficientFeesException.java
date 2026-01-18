package Exception;

public class InsufficientFeesException extends Exception {

    @Override
    public String toString() {
        return "Fees paid is less than 30% of total course fees!";
    }
}
