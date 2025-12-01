package PolymorephismDemo;

public class Farmer {

	    int farmerId;
	    String farmerName;
	    double landArea;
	    String city;
	    double annualIncome;
	    int noOfEquipment;
	    double insuranceAmt;
	    double subsidy;

	    // Default Constructor
	    Farmer() {
	        System.out.println("Default Farmer Constructor Called");
	        this.farmerId = 0;
	        this.farmerName = "Not Given";
	        this.landArea = 0.0;
	        this.city = "Not Given";
	        this.annualIncome = 0.0;
	        this.noOfEquipment = 0;
	        this.insuranceAmt = 0.0;
	        this.subsidy = 20000;
	    }

	    // Parameterized Constructor
	    Farmer(int farmerId, String farmerName, double landArea, String city,
	           double annualIncome, int noOfEquipment, double insuranceAmt, double subsidy) {
	        this.farmerId = farmerId;
	        this.farmerName = farmerName;
	        this.landArea = landArea;
	        this.city = city;
	        this.annualIncome = annualIncome;
	        this.noOfEquipment = noOfEquipment;
	        this.insuranceAmt = insuranceAmt;
	        this.subsidy = subsidy;
	        System.out.println("Parameterized Farmer Constructor Called");
	    }

	    // Polymorphic method
	    void calculateSubsidy() {
	        System.out.println("Base Farmer Subsidy Calculation");
	        subsidy += 1000; // base increase
	    }

	    void display() {
	        System.out.println("Farmer ID: " + farmerId);
	        System.out.println("Farmer Name: " + farmerName);
	        System.out.println("Land Area: " + landArea);
	        System.out.println("City: " + city);
	        System.out.println("Annual Income: " + annualIncome);
	        System.out.println("Number of Equipment: " + noOfEquipment);
	        System.out.println("Insurance Amount: " + insuranceAmt);
	        System.out.println("Revised Subsidy: ₹" + subsidy);
	    }
	}

	// ---------------- Dairy Farmer ----------------
	class DairyFarmer extends Farmer {

	    int noOfCattles;
	    double milkProducedPerDay;
	    String dairyLicenceNo;

	    DairyFarmer(int farmerId, String farmerName, double landArea, String city,
	                double annualIncome, int noOfEquipment, double insuranceAmt, double subsidy,
	                int noOfCattles, double milkProducedPerDay, String dairyLicenceNo) {
	        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt, subsidy);
	        this.noOfCattles = noOfCattles;
	        this.milkProducedPerDay = milkProducedPerDay;
	        this.dairyLicenceNo = dairyLicenceNo;
	        System.out.println("DairyFarmer Parameterized Constructor Called");
	    }

	    @Override
	    void calculateSubsidy() {
	        System.out.println("Dairy Farmer Subsidy Calculation");
	        subsidy += milkProducedPerDay * 10; // ₹10 per liter of milk
	    }

	    @Override
	    void display() {
	        super.display();
	        System.out.println("Number of Cattles: " + noOfCattles);
	        System.out.println("Milk Produced Per Day: " + milkProducedPerDay);
	        System.out.println("Dairy Licence No: " + dairyLicenceNo);
	    }
	}

	// ---------------- Poultry Farmer ----------------
	class PoultryFarmer extends Farmer {

	    int noOfChickens;
	    int hens;
	    int noOfShedCapacity;
	    int eggsProducedPerDay;
	    String poultryFarmerName;

	    PoultryFarmer(int farmerId, String farmerName, double landArea, String city,
	                  double annualIncome, int noOfEquipment, double insuranceAmt, double subsidy,
	                  int noOfChickens, int hens, int noOfShedCapacity, int eggsProducedPerDay,
	                  String poultryFarmerName) {
	        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt, subsidy);
	        this.noOfChickens = noOfChickens;
	        this.hens = hens;
	        this.noOfShedCapacity = noOfShedCapacity;
	        this.eggsProducedPerDay = eggsProducedPerDay;
	        this.poultryFarmerName = poultryFarmerName;
	        System.out.println("PoultryFarmer Parameterized Constructor Called");
	    }

	    @Override
	    void calculateSubsidy() {
	        System.out.println("Poultry Farmer Subsidy Calculation");
	        subsidy += eggsProducedPerDay * 2; // ₹2 per egg
	    }

	    @Override
	    void display() {
	        super.display();
	        System.out.println("Number of Chickens: " + noOfChickens);
	        System.out.println("Number of Hens: " + hens);
	        System.out.println("Shed Capacity: " + noOfShedCapacity);
	        System.out.println("Eggs Produced Per Day: " + eggsProducedPerDay);
	        System.out.println("Poultry Farmer Name: " + poultryFarmerName);
	    }
	}

	// ---------------- Organic Farmer ----------------
	class OrganicFarmer extends Farmer {

	    int organicFarmerId;
	    String cropType;
	    String fertilizerUsed;

	    OrganicFarmer(int farmerId, String farmerName, double landArea, String city,
	                  double annualIncome, int noOfEquipment, double insuranceAmt, double subsidy,
	                  int organicFarmerId, String cropType, String fertilizerUsed) {
	        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt, subsidy);
	        this.organicFarmerId = organicFarmerId;
	        this.cropType = cropType;
	        this.fertilizerUsed = fertilizerUsed;
	        System.out.println("OrganicFarmer Parameterized Constructor Called");
	    }

	    @Override
	    void calculateSubsidy() {
	        System.out.println("Organic Farmer Subsidy Calculation");
	        if (fertilizerUsed.equalsIgnoreCase("Compost"))
	            subsidy += 5000;
	        else
	            subsidy += 2000;
	    }

	    @Override
	    void display() {
	        super.display();
	        System.out.println("Organic Farmer ID: " + organicFarmerId);
	        System.out.println("Crop Type: " + cropType);
	        System.out.println("Fertilizer Used: " + fertilizerUsed);
	    }
	}

	// ---------------- TestFarmers ----------------
	class TestFarmers {
	    public static void main(String[] args) {

	        Farmer f;

	        System.out.println("\n--- Base Farmer ---");
	        f = new Farmer(109, "Trupti", 12.4, "Dhule", 450000, 6, 4555, 34000);
	        f.calculateSubsidy();
	        f.display();

	        System.out.println("\n--- Dairy Farmer ---");
	        f = new DairyFarmer(101, "Neha", 12.5, "Pune", 50000.0, 5, 2000.0, 4000, 15, 120.5, "DL-12345");
	        f.calculateSubsidy();
	        f.display();

	        System.out.println("\n--- Poultry Farmer ---");
	        f = new PoultryFarmer(102, "Tushar", 5.0, "Washim", 40000.0, 3, 1500.0, 2000, 150, 50, 2, 120, "Suresh Poultry Farm");
	        f.calculateSubsidy();
	        f.display();

	        System.out.println("\n--- Organic Farmer ---");
	        f = new OrganicFarmer(103, "Punam", 8.5, "Mumbai", 60000.0, 4, 3000.0, 6000, 1, "Vegetables", "Compost");
	        f.calculateSubsidy();
	        f.display();
	    }
	}
