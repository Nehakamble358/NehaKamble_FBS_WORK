class Student
{
	int rollno;
	String name;
	double marks;

	void setRollno(int r){
		this.rollno=r;
	}
	void setName(String str){
		this.name=str;
	}
	void setMarks(double m){
		this.marks=m;
	}
}
class TestStudent
{
	public static void main(String[] args)
	{
		Student s1;
		s1=new Student();
		s1.setRollno(109);
		s1.setName("Savi");
		s1.setMarks(89);
		System.out.println("Student RollNo:"+ s1.rollno);
		System.out.println("Student Name:"+ s1.name);
		System.out.println("Student Marks:"+ s1.marks);
 	}
}

o/p:-Student RollNo:109
Student Name:Savi
Student Marks:89.0

	