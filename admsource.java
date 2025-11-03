class Admin
{
 	int ID;
	String name;
	double salary;
	double allowance;

	void setID(int i){
		this.id=i;
	}
	void setName(Sting str){
		this.name=str;
	}
	void setSalary(double s){
		this.salary=s;
	}
	void setAllowence(double a){
		this.allowence=a;
	}
}
//Admin class ends here.
class TestAdmin
{
	public static void main(String[]args){
		Admin=a1;
		a1=new Admin();
		a1.setID(102);
 		a1.setName("Nikita");
		a1.setSalary(45000);
		a1.setAllowance(5000);

		System.out.println("Admin ID:"+ a1.id);
		System.out.println("Admin Name:"+ a1.name);
		System.out.println("Admin Salary:"+ a1.salary);
		System.out.println("Admin Allowance:"+ a1.allowance);
	}
}
//TestAdmin class ends here.
		