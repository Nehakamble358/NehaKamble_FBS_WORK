class HR
{
	int id;
	String name;
	double salary;
	double commission;

	void setID(int i){
		this.id=i;
	}
	void setName(String str){
		this.name=str;
	}
	void setSalary(double s){
		this.salary=s;
	}
	void setCommission(double c){
		this.commission=c;
	}
}
class TestHR
{
	public static void main(String[] args)
	{
		HR h1;
		h1=new HR();
		h1.setID(105);
		h1.setName("Shweta");
		h1.setSalary(46000);
		h1.setCommission(2500);
		System.out.println("HR ID:"+ h1.id);
		System.out.println("HR Name:"+ h1.name);
		System.out.println("HR Salary:"+ h1.salary);
		System.out.println("HR Commission:"+ h1.commission);
	}
}
o/p:-HR ID:105
HR Name:Shweta
HR Salary:46000.0
HR Commission:2500.0
			


