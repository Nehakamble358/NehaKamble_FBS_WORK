package PolymorephismDemo;

public class HospitalStaff {
	// ---------- Parent Class ----------
	    String name;
	    String role;
	    String department;
	    double salary;
	    
	     String getName() {
			return name;
		}

		 void setName(String name) {
			this.name = name;
		}
		 
		 String getRole() {
			return role;
		}

		 void setRole(String role) {
			this.role = role;
		}

		 String getDepartment() {
			return department;
		}

		 void setDepartment(String department) {
			this.department = department;
		}

		 double getSalary() {
			return salary;
		}

		 void setSalary(double salary) {
			this.salary = salary;
		}

		HospitalStaff() // default constructor
	    {
	        System.out.println("HospitalStaff Default Constructor");
	        name = "Dr. Aditi Sharma";
	        role = "Doctor";
	        department = "Cardiology";
	        salary = 85000.00;
	    }

	    HospitalStaff(String name, String role, String department, double salary) // parameterized
	    {
	        System.out.println("HospitalStaff Parameterized Constructor");
	        this.name = name;
	        this.role = role;
	        this.department = department;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Role: " + role);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: ₹" + salary);
	    }
	    void work() {
	        System.out.println(name + " is working in the hospital.");
	    }

	}

	// ---------- Subclass 1: Doctor ----------
	class Doctor extends HospitalStaff {
	    String specialization;
	    
	    String getSpecialization() {
			return specialization;
		}

		 void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		Doctor(){
	    	specialization="Dermatologist";
	    }

	    Doctor(String name, String department, double salary, String specialization) {
	        super(name, "Doctor", department, salary);
	        this.specialization = specialization;
	    }

	    void work() {
	        System.out.println("👨‍⚕️ " + name + " is treating patients in " + specialization + ".");
	    }

	    void display() {
	        super.display();
	        System.out.println("Specialization: " + specialization);
	    }
	}

	// ---------- Subclass 2: Nurse ----------
	class Nurse extends HospitalStaff {
	    String shift;
	    
	     String getShift() {
			return shift;
		}

		 void setShift(String shift) {
			this.shift = shift;
		}

		Nurse(){
	    	shift = "Night";
	    }

	    Nurse(String name, String department, double salary, String shift) {
	        super(name, "Nurse", department, salary);
	        this.shift = shift;
	    }

	    void display() {
	        super.display();
	        System.out.println("Shift: " + shift);
	    }
	    void work() {
	        System.out.println("👩‍⚕️ " + name + " is caring for patients during the " + shift + " shift.");
	    }

	}

	// ---------- Subclass 3: Technician ----------
	class Technician extends HospitalStaff {
	    String equipmentType;
	    
	    String getEquipmentType() {
			return equipmentType;
		}

		 void setEquipmentType(String equipmentType) {
			this.equipmentType = equipmentType;
		}

		Technician(){
	    	equipmentType = "X-Ray Machine";
	    }

	    Technician(String name, String department, double salary, String equipmentType) {
	        super(name, "Technician", department, salary);
	        this.equipmentType = equipmentType;
	    }

	    void display() {
	        super.display();
	        System.out.println("Equipment Type: " + equipmentType);
	    }
	    void work() {
	        System.out.println("🔧 " + name + " is maintaining " + equipmentType + " equipment.");
	    }
	}

	// ---------- Test Class ----------
	class TestHospitalStaff {
	    public static void main(String[] args) {
	        HospitalStaff s;

	        System.out.println("--- Doctor ---");
	        s = new Doctor("Dr. Neha Patil", "Cardiology", 120000, "Heart Specialist");
	        s.display();
	        s.work();

	        System.out.println("\n--- Nurse ---");
	        s = new Nurse("Sonia Sharma", "Pediatrics", 60000, "Night");
	        s.display();
	        s.work();

	        System.out.println("\n--- Technician ---");
	        s = new Technician("Rajesh Kumar", "Radiology", 55000, "X-Ray");
	        s.display();
	        s.work();
	    }
	}

