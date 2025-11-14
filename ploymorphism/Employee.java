package PolymorephismDemo;

public class Employee {
	int id;
	String name;
	double salary;


	Employee()// default constructor
	{
		System.out.println("Constructor called");
		this.id = 49;
		this.name = "Neha";
		this.salary = 90000;
		
		
	}

	Employee(int id, String name, double salary)// parameterized constructor
	{
		System.out.println("parameterized  Constructor called");
		this.id = id;
		this.name = name;
		this.salary = salary;
		
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
	
	void display() {
		System.out.println("ID is::" + this.id);
		System.out.println("Name is::" + this.name);
		System.out.println("Salary is::" + this.salary);
	}
	double Calsalary() {
		return salary;
		
	}
}// employee class ends here

class Admin extends Employee {
	double allowance;

	Admin()// default constructor
	{
		super();
		System.out.println("Constructor called");
		allowance = 2300;
	}

	Admin(int id, String name, double salary, double allowance)// parameterized constructor
	{
		super(id, name, salary);
		System.out.println("  parameterized  Constructor called");
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display() {
		super.display();
		System.out.println("allowance is::" + this.allowance);
	}
	double Calsalary() {
		return  salary+allowance;
	}
}

class HR extends Employee {
	double commission;

	HR()// default constructor
	{
		super();
		System.out.println("Constructor called");
		this.commission = 4000;
	}

	HR(int id, String name, double salary, double commission)// parameterized constructor
	{
		super(id, name, salary);
		System.out.println(" parameterized Constructor called");
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	void display() {
		super.display();
		System.out.println("commission is::" + this.commission);
	}
	double Calsalary() {
		return  salary+commission;
	}
}// HR class ends here

class SalesManager extends Employee {
	double incentive;
	double target;

	SalesManager()// default constructor
	{
		super();
		System.out.println("Constructor called");
		this.incentive = 40099;
		this.target = 3400;

	}

	SalesManager(int id, String name, double salary, double incentive, double target)// default constructor
	{
		super(id, name, salary );
		System.out.println(" parameterized Constructor called");
		this.incentive = incentive;
		this.target = target;
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

	void display() {
		super.display();
		System.out.println("incentive is::" + this.incentive);
		System.out.println("target is::" + this.target);
	}
	double Calsalary() {
		return  salary+incentive;
	}
}

class DemoPolyEmployee {
	public static void main(String[] args) {
		Employee e1;
		e1 = new Employee(102,"Neha",20000);
		e1.display();

		e1 = new Admin(1, "Sanket", 25000 ,4000);
		e1.display();
		System.out.println("\n");

		e1 = new HR(1, "runali", 45000,6000);
		e1.display();
		System.out.println("\n");

		e1 = new SalesManager(2, "shital", 30000, 500,5);
		e1.display();

		e1.Calsalary();
	}
}
