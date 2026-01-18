package Exception;

public class FeesNotPaidException extends Exception {

    @Override
    public String toString() {
        return "No fees paid. At least some fees must be paid!";
    }
}
