class SalesManager
{
	int id;
	String name;
	double salary;
	boolean insensitive;
	double target;

	void setID(int i){
		this.id=i;
	}
	void setName(String str){
		this.name=str;
	}
	void setSalary(double s){
		this.salary=s;
	}
	void setInsensitive(Boolean i){
		this.insensitive =i;
	}
	void setTarget(double t){
		this.target=t;
	}
}
class TestSalesManager
{
	public static void main(String[] args)
	{
		SalesManager s1;
		s1=new SalesManager();
		s1.setID(107);
		s1.setName("Trupti");
		s1.setInsensitive(true);
		s1.setTarget(50000);
		System.out.println("SalesManager ID:"+ s1.id);
		System.out.println("SalesManager Name:"+ s1.name);
		System.out.println("SalesManager Insensitive "+ s1.insensitive);
		System.out.println("SalesManager Target:"+ s1.target);
	}
}

o/p:-SalesManager ID:107
SalesManager Name:Trupti
SalesManager Insensitive true
SalesManager Target:50000.0
