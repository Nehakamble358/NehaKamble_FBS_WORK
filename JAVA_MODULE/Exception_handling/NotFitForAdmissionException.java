package Exception;

public class NotFitForAdmissionException extends Exception {

    @Override
    public String toString() {
        return "Student percentage is below 35%. Not eligible!";
    }
}
