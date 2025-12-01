package inheritanceDemo;

public class Student {

	int fbid;
	String name;
	int distance;
	static int count = 0;

	Student() {
		fbid = 100;
		name = "not given";
		distance = 10;
		count++;
	}// default constructor

	Student(int fbid, String name, int distance) {
		this.fbid = fbid;
		this.name = name;
		this.distance = distance;
		count++;
	}// parameterized constructor

	int getFbid() {
		return fbid;
	}

	void setFbid(int fbid) {
		this.fbid = fbid;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getDistance() {
		return distance;
	}

	void setDistance(int distance) {
		this.distance = distance;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Student.count = count;
	}

	void display() {
		System.out.println("Fisrtbit id is:" + this.fbid);
		System.out.println("Name is:" + this.name);
		System.out.println("Distance is:" + this.distance);
	}
}// Class student ends here

class PlacedStudent extends Student { // step 1 "is-a"

	// step 2 remove state and behavoiour which is alvailable is super class
	// unessesary part remove
	String companyName;
	String designation;

	PlacedStudent() {
		super(); // step 4 a
		companyName = "Infosys";
		designation = "Manager";
		System.out.println("PlacedStudent default construtor");
	}

	PlacedStudent(int fbid, String name, int distance, String companyName, String designation) {
		super(fbid, name, distance); // step 4 b
		System.out.println("PlacedStudent para construtor");

		this.companyName = companyName;
		this.designation = designation;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	void display() {
		super.display(); // step 3
		System.out.println("ComapanyName is:" + this.companyName);
		System.out.println("Designation is:" + this.designation);
	}
}// class pasedstudent ends here

class DemoInheritance {
	public static void main(String[] args) {
		// Student s1=new Student();
		// System.out.println("Student count total: "+Student.getCount());

		// Student s2=new Student(101,"Neha",100);
		// System.out.println("Student count total: "+Student.getCount());

		PlacedStudent ps2 = new PlacedStudent();
		ps2.display();
		System.out.println(ps2.getName());
		System.out.println("\n\n");

		PlacedStudent ps1 = new PlacedStudent(58, "Tushar", 400, "TCS", "Mna ger");
		System.out.println("Student count total: " + Student.getCount());
		ps1.display();
		System.out.println(ps1.getName());

	}
}
