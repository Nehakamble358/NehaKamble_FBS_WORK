class Employee
{
 	int id;
	String name;
	double salary;

	void setID(int i){
 		this.id=i;
	}
	void setName(String str){
		this.name = str;
	}
	void setSalary(double s){
		this.salary = s;
	}
}
class TestEmployee
{
	public static void main(String[] args)
	{
		Employee e1;
		e1=new Employee();
		e1.setID(101);
		e1.setName("Neha");
		e1.setSalary(40000);
		System.out.println("Employee ID:"+ e1.id);
		System.out.println("Employee Name:"+ e1.name);
		System.out.println("Employee Salary:"+ e1.salary);
	}
}

o/p:-D:\fristbit solution\java module>java TestEmployee
Employee ID:101
Employee Name:Neha
Employee Salary:40000.0
		
	

	
	