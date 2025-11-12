package inheritanceDemo;

public class Department {
	// Base class
	     String deptName;
	     String manager;
	     int numberOfEmployees;

	    // Default constructor
	     Department() {
	        this.deptName = "Unknown";
	        this.manager = "Unknown";
	        this.numberOfEmployees = 0;
	    }

	    // Parameterized constructor
	     Department(String deptName, String manager, int numberOfEmployees) {
	        this.deptName = deptName;
	        this.manager = manager;
	        this.numberOfEmployees = numberOfEmployees;
	    }

	    // Getters and Setters
	     String getDeptName() { 
	    	return deptName; 
	    	}
	     void setDeptName(String deptName) { 
	    	this.deptName = deptName; 
	    	}

	    String getManager() { 
	    	return manager; 
	    	}
	    void setManager(String manager) { 
	    	this.manager = manager;
	    	}

	    int getNumberOfEmployees() {
	    	return numberOfEmployees;
	    	}
	    void setNumberOfEmployees(int numberOfEmployees) { 
	    	this.numberOfEmployees = numberOfEmployees;
	    	}

	    // Display method
	      void display() {
	        System.out.println("Department Name      : " + deptName);
	        System.out.println("Manager              : " + manager);
	        System.out.println("Number of Employees  : " + numberOfEmployees);
	    }

	    // Unique method
	    void holdMeeting() {
	        System.out.println(deptName + " is holding a general meeting.");
	    }
	}

	// Derived class 1
	class HRDepartment extends Department {
	     int recruitmentCount;
	     int trainingPrograms;

	    // Default constructor
	     HRDepartment() {
	        super();
	        this.recruitmentCount = 0;
	        this.trainingPrograms = 0;
	    }

	    // Parameterized constructor
	    HRDepartment(String deptName, String manager, int numberOfEmployees, int recruitmentCount, int trainingPrograms) {
	        super(deptName, manager, numberOfEmployees);
	        this.recruitmentCount = recruitmentCount;
	        this.trainingPrograms = trainingPrograms;
	    }

	    // Getters and Setters
	    int getRecruitmentCount() { 
	    	return recruitmentCount; 
	    	}
	    void setRecruitmentCount(int recruitmentCount) { 
	    	this.recruitmentCount = recruitmentCount; 
	    	}

	     int getTrainingPrograms() { return trainingPrograms; }
	     void setTrainingPrograms(int trainingPrograms) { 
	    	this.trainingPrograms = trainingPrograms; 
	    	}

	    // Override display
	    
	     void display() {
	        super.display();
	        System.out.println("Recruitment Count    : " + recruitmentCount);
	        System.out.println("Training Programs    : " + trainingPrograms);
	    }

	    // Unique method
	    void organizeTraining() {
	        System.out.println(getDeptName() + " is organizing " + trainingPrograms + " training programs.");
	    }
	}

	// Derived class 2
class ITDepartment extends Department {
	     int projects;
	     int supportTickets;

	    // Default constructor
	    ITDepartment() {
	        super();
	        this.projects = 0;
	        this.supportTickets = 0;
	    }

	    // Parameterized constructor
	   ITDepartment(String deptName, String manager, int numberOfEmployees, int projects, int supportTickets) {
	        super(deptName, manager, numberOfEmployees);
	        this.projects = projects;
	        this.supportTickets = supportTickets;
	    }

	    // Getters and Setters
	     int getProjects() { 
	    	return projects; 
	    	}
	    void setProjects(int projects) { 
	    	this.projects = projects; 
	    	}

	    int getSupportTickets() { 
	    	return supportTickets; 
	    	}
	     void setSupportTickets(int supportTickets) { 
	    	this.supportTickets = supportTickets; 
	    	}

	    // Override @Override
	     void display() {
	        super.display();
	        System.out.println("Projects : " + projects);
	        System.out.println("Support Tickets : " + supportTickets);
	    }

	    // Unique method
	     void startProject(String projectName) {
	        System.out.println(getDeptName() + " is starting the project: " + projectName);
	    }
	}

	// Multilevel inheritance
class SoftwareTeam extends ITDepartment {
	     String teamLead;
	     int teamSize;

	    // Default constructor
	    SoftwareTeam() {
	        super();
	        this.teamLead = "Unknown";
	        this.teamSize = 0;
	    }

	    // Parameterized constructor
	    SoftwareTeam(String deptName, String manager, int numberOfEmployees, int projects, int supportTickets, String teamLead, int teamSize) {
	        super(deptName, manager, numberOfEmployees, projects, supportTickets);
	        this.teamLead = teamLead;
	        this.teamSize = teamSize;
	    }

	    // Getters and Setters
	    String getTeamLead() { 
	    	return teamLead;
	    	}
	   void setTeamLead(String teamLead) { 
	    	this.teamLead = teamLead; 
	    	}

	     int getTeamSize() { 
	    	return teamSize; 
	    	}
	     void setTeamSize(int teamSize) {
	    	this.teamSize = teamSize; 
	    	}

	    // Override display
	   
	     void display() {
	        super.display();
	        System.out.println("Team Lead : " + teamLead);
	        System.out.println("Team Size : " + teamSize);
	    }

	    // Unique method
	    void conductCodeReview() {
	        System.out.println("Software team led by " + teamLead + " is conducting a code review for " + teamSize + " members.");
	    }
	}

	// Main class
	 class CompanyTest {
	    public static void main(String[] args) {
	        // Using parameterized constructors
	        HRDepartment hr = new HRDepartment("HR", "Alice", 10, 5, 3);
	        ITDepartment it = new ITDepartment("IT", "Bob", 15, 4, 20);
	        SoftwareTeam softwareTeam = new SoftwareTeam("IT", "Bob", 15, 4, 20, "Charlie", 6);
	    

	        // Display information and call methods
	        System.out.println("---- HR Department ----");
	        hr.display();
	        hr.organizeTraining();
	        hr.holdMeeting();

	        System.out.println("\n---- IT Department ----");
	        it.display();
	        it.startProject("Website Upgrade");
	        it.holdMeeting();

	        System.out.println("\n---- Software Team ----");
	        softwareTeam.display();
	        softwareTeam.conductCodeReview();
	        softwareTeam.startProject("Mobile App Development");
	        softwareTeam.holdMeeting();
	    }
	}

