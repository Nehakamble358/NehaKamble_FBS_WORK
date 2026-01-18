package downcasting;

interface Emp {
	void display();
}

// abstract class
abstract class Employee implements Emp {

	int id;
	String name;
	double salary;

	Employee() {
	}

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
}

// Admin
class Admin extends Employee {

	double allowance;

	Admin() {
		allowance = 2300;
		System.out.println("Admin Default Constructor");
	}

	Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
		System.out.println("Admin Parameterized Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Allowance : " + allowance);
	}
}

// HR
class HR extends Employee {

	double commission;

	HR() {
		commission = 4000;
		System.out.println("HR Default Constructor");
	}

	HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
		System.out.println("HR Parameterized Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Commission : " + commission);
	}
}

// SalesManager
class SalesManager extends Employee {

	double incentive;
	double target;

	SalesManager() {
		incentive = 4000;
		target = 3000;
		System.out.println("SalesManager Default Constructor");
	}

	SalesManager(int id, String name, double salary, double incentive, double target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
		System.out.println("SalesManager Parameterized Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Incentive : " + incentive);
		System.out.println("Target : " + target);
	}
}

// Main class
class DemoEmp {

	public static void main(String[] args) {

		giveBonus(new SalesManager(101, "Neha", 60000, 20000, 20));
		giveBonus(new Admin(102, "Tushar", 70000, 5000));
		giveBonus(new HR(103, "Nikita", 50000, 3000));
	}

	static void giveBonus(Emp e) {

		if (e instanceof SalesManager) {
			SalesManager s = (SalesManager) e; // downcasting
			s.incentive += 5000;
			System.out.println("\nSalesManager Bonus Added\n");
			s.display();
		} else if (e instanceof Admin) {
			Admin a = (Admin) e; // downcasting
			a.allowance += 3000;
			System.out.println("\nAdmin Bonus Added\n");
			a.display();
		} else if (e instanceof HR) {
			HR h = (HR) e; // downcasting
			h.commission += 2000;
			System.out.println("\nHR Bonus Added\n");
			h.display();
		}
	}
}
