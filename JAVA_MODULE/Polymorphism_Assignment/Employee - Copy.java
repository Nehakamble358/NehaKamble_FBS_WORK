package PolymorephismDemo;

abstract class Employee {
	int id;
	String name;
	double salary;

	Employee() {
		System.out.println("Default Constructor called");
		this.id = 49;
		this.name = "Neha";
		this.salary = 90000;
	}

	Employee(int id, String name, double salary) {
		System.out.println("Parameterized Constructor called");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters-Setters
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

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	// Abstract Method
	abstract double Calsalary();

	public String toString() {
		return "ID:: " + id + "  Name:: " + name + "  Salary:: " + salary;
	}
}

class Admin extends Employee {
	double allowance;

	Admin() {
		super();
		System.out.println("Admin Default Constructor");
		this.allowance = 2300;
	}

	Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		System.out.println("Admin Parameterized Constructor");
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	double Calsalary() {
		return salary + allowance;
	}

	public String toString() {
		return super.toString() + "  Allowance:: " + allowance;
	}
}

class HR extends Employee {
	double commission;

	HR() {
		super();
		System.out.println("HR Default Constructor");
		this.commission = 4000;
	}

	HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		System.out.println("HR Parameterized Constructor");
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	double Calsalary() {
		return salary + commission;
	}

	public String toString() {
		return super.toString() + "  Commission:: " + commission;
	}
}

// ---------------- SalesManager Class -------------------

class SalesManager extends Employee {
	double incentive;
	double target;

	SalesManager() {
		super();
		System.out.println("SalesManager Default Constructor");
		this.incentive = 40099;
		this.target = 3400;
	}

	SalesManager(int id, String name, double salary, double incentive, double target) {
		super(id, name, salary);
		System.out.println("SalesManager Parameterized Constructor");
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

	double Calsalary() {
		return salary + incentive + target;
	}

	public String toString() {
		return super.toString() + "  Incentive:: " + incentive + "  Target:: " + target;
	}
}

class DemoPolyEmployee {
	public static void main(String[] args) {

		Employee e1;

		e1 = new Admin(1, "Sanket", 25000, 4000);
		System.out.println(e1.toString());

		e1 = new HR(1, "Runali", 45000, 6000);
		System.out.println(e1.toString());

		e1 = new SalesManager(2, "Shital", 30000, 500, 5);
		System.out.println(e1.toString());
	}
}