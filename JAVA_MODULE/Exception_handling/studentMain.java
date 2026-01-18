package Exception;

public class studentMain {
	public static void main(String[]arges) {
		Student s = new Student(1, "Neha", 85);

        try {
            s.validate();
        } 
        catch (InvalidMarksException e) {
            System.out.println(e);
        }
    }
}
	


