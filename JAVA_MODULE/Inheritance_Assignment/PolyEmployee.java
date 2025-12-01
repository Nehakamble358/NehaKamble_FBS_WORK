package inheritanceDemo;

public class PolyEmployee {
	int id;
	String name;
  	double salary;
  	
  	PolyEmployee()//default constructor
	{
	System.out.println("Constructor called");
	this.id=45;
	this.name="xyz";
	this.salary=4567;
	}
  	PolyEmployee(int id,String name,double salary)//parameterized   constructor
	{
	System.out.println("parameterized  Constructor called");
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
  	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void display()
	{
	System.out.println("ID is::"+this.id);
	System.out.println("Name is::"+this.name);
	System.out.println("Salary is::"+this.salary);
	}
}//employee class ends here
class Admin extends PolyEmployee
{
	double allowance;
	
	Admin()//default constructor
	{
	super();
	System.out.println("Constructor called");
	allowance=2300;
	}
	
	Admin(int id,String name,double salary,double allowance)//parameterized   constructor
	{
	super(id, name, salary);
	System.out.println("  parameterized  Constructor called");
	this.allowance=allowance;
	}
	
public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display()
	{
	super.display();
	System.out.println("allowance is::"+this.allowance);
	}
}
class HR extends PolyEmployee
{
 	double commission;
 	
	HR()//default constructor
	{
		super();
	System.out.println("Constructor called");
 	this.commission=4000;
	}
	
	HR(int id,String name,double salary,double commission)//parameterized  constructor
	{
		super(id, name, salary);
		System.out.println(" parameterized Constructor called");
 	this.commission=commission;
	}
	
public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	void display()
	{
	super.display();
	System.out.println("commission is::"+this.commission);
	}
}//HR class ends here
class SalesManager extends PolyEmployee
{
 	double incentive;
	double target;
	SalesManager()//default constructor
	{
	super();
	System.out.println("Constructor called");
	this.incentive=40099;
	this.target=3400;
	
	}
	
	SalesManager(int id,String name,double salary,double incentive,double target)//default constructor
	{
	super(id, name, salary);
	System.out.println(" parameterized Constructor called");
	this.incentive=incentive;
	this.target=target;
	}
	
	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		this.target = target;
	}

	void display()
	{
	super.display();
	System.out.println("incentive is::"+this.incentive);
	System.out.println("target is::"+this.target);
	}
}
class DemoPolyEmployee
{
	public static void main(String[] args) {
		PolyEmployee e1;
		e1 = new Admin();
		e1.display();
		
		e1= new Admin(1,"Sanket",20000,5400);
		e1.display();
		System.out.println("\n");
		
		e1 = new HR();
		e1.display();
		
		e1= new HR(1,"runali",98766,2200);
		e1.display();
		
		System.out.println("\n");
		
		e1 = new SalesManager();
		e1.display();
		
		e1= new SalesManager(2,"shrinath",34567,4500,6032);
		e1.display();
		
		e1.display();
		e1.display();
		e1.display();
	
	
	}
}
	

	
	
