package Exception;

public class Student {
	
	int Rollno;
	String name;
	double marks;
	
	public Student(int rollno, String name, double marks) {
		Rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	void validate() throws InvalidMarksException{

		if(marks<0 || marks>100)
			throw new InvalidMarksException();
		
		
	    if(this.marks <35) {
			System.out.println("Fail- Masrks below 35");
		
		}else if (marks >=75){
			System.out.println("Distinction"); 
			
		}else if( marks >= 60 ){
			System.out.println("First  class"); 
			
		}else if( marks >= 50){
			System.out.println(" Second class"); 
			
		}else {
			System.out.println(" pass class");
		}
	    
	}
}
