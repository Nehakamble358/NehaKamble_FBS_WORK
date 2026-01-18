package Exception;

public class AdmissionFrom {

    String studentName;
    int age;
    double percentage;
    int courseFees;
    int feesPaid;

    public AdmissionFrom(String studentName, int age, double percentage, int courseFees, int feesPaid) {
        this.studentName = studentName;
        this.age = age;
        this.percentage = percentage;
        this.courseFees = courseFees;
        this.feesPaid = feesPaid;
    }

    void validateForm() throws
            EmptyNameException,
            UnderageException,
            InvalideParsentageException,
            NotFitForAdmissionException,
            FeesNotPaidException,
            InsufficientFeesException {

        if (studentName == null || studentName.trim().isEmpty()) {
            throw new EmptyNameException();
        }

        if (age < 17) {
            throw new UnderageException();
        }

        if (percentage < 0 || percentage > 100) {
            throw new InvalideParsentageException();
        }

        if (percentage < 35) {
            throw new NotFitForAdmissionException();
        }

        if (feesPaid == 0) {
            throw new FeesNotPaidException();
        }

        double required = courseFees * 0.30;

        if (feesPaid < required) {
            throw new InsufficientFeesException();
        }

        System.out.println("Admission Successful!");
    }
}