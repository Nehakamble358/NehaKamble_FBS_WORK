package Abstraction;

abstract class Employee {
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

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * void display() { System.out.println("ID is::" + this.id);
	 * System.out.println("Name is::" + this.name); System.out.println("Salary is::"
	 * + this.salary); }
	 */
	abstract void display();

	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "]";
	}

}// employee class ends here

class Admin extends Employee {
	double allowance;

	Admin()// default constructor
	{
		super();
		System.out.println("Constructor called");
		// allowance = 2300;
	}

	Admin(int id, String name, double salary, double allowance)// parameterized constructor
	{
		super(id, name, salary);
		System.out.println("  parameterized  Constructor called");
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return super.toString() + "Admin [allowance=" + this.allowance + "]";
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
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

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return super.toString() + "HR [commission=" + this.commission + "]";
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
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
		super(id, name, salary);
		System.out.println(" parameterized Constructor called");
		this.incentive = incentive;
		this.target = target;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	void setTarget(double target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return super.toString() + "SalesManager [incentive=" + this.incentive + ", target=" + this.target + "]";
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
}
class DemoPolyEmployee {
	public static void main(String[] args) {
		Employee e1;

		e1 = new Admin(1, "Sanket", 25000, 4000);
		e1.display();
		System.out.println(e1.toString());

		e1 = new HR(1, "runali", 45000, 6000);
		e1.display();
		System.out.println(e1.toString());

		e1 = new SalesManager(2, "shital", 30000, 500, 5);
		e1.display();
		System.out.println(e1.toString());

	}
}
