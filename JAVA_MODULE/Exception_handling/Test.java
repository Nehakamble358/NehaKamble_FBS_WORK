package Exception;

public class Test {
	public static void main(String[]args) {
		
		Student s = new Student(1,"Neha",70);
		
		try {
			s.validate();
		} catch (InvalidMarksException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
