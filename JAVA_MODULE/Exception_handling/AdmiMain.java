package Exception;

public class AdmiMain {

    public static void main(String[] args) {

        AdmissionFrom from = new AdmissionFrom("neha", 18, 75.20, 50000, 10000);

        try {
            from.validateForm();
        }
        catch (EmptyNameException e) {
            System.out.println(e.getMessage());
        }
        catch (UnderageException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalideParsentageException e) {
            System.out.println(e.getMessage());
        }
        catch (NotFitForAdmissionException e) {
            System.out.println(e.getMessage());
        }
        catch (FeesNotPaidException e1) {
            System.out.println(e1.getMessage());
        }
        catch (InsufficientFeesException e2) {
            System.out.println(e2.getMessage());
        }
    }
}