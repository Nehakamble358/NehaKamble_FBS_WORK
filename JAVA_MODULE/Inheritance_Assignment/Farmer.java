package inheritanceDemo;

public class Farmer {
	   int farmerId;
	    String farmerName;
	    double landArea;
	    String city;
	    double annualIncome;
	    int noOfEquipment;
	    double insuranceAmt;

	    Farmer()// Default Constructor
	 
	    {
	        System.out.println("Default Farmer Constructor Called");
	        this.farmerId = 0;
	        this.farmerName = "Not Given";
	        this.landArea = 0.0;
	        this.city = "Not Given";
	        this.annualIncome = 0.0;
	        this.noOfEquipment = 0;
	        this.insuranceAmt = 0.0;
	    }

	    Farmer(int farmerId, String farmerName, double landArea, String city,
	           double annualIncome, int noOfEquipment, double insuranceAmt)// Parameterized Constructor

	    {
	        this.farmerId = farmerId;
	        this.farmerName = farmerName;
	        this.landArea = landArea;
	        this.city = city;
	        this.annualIncome = annualIncome;
	        this.noOfEquipment = noOfEquipment;
	        this.insuranceAmt = insuranceAmt;
	        System.out.println("Parameterized Farmer Constructor Called");
	    }
	      

	    public int getFarmerId() {
			return farmerId;
		}

		public void setFarmerId(int farmerId) {
			this.farmerId = farmerId;
		}

		public String getFarmerName() {
			return farmerName;
		}

		public void setFarmerName(String farmerName) {
			this.farmerName = farmerName;
		}

		public double getLandArea() {
			return landArea;
		}

		public void setLandArea(double landArea) {
			this.landArea = landArea;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public double getAnnualIncome() {
			return annualIncome;
		}

		public void setAnnualIncome(double annualIncome) {
			this.annualIncome = annualIncome;
		}

		public int getNoOfEquipment() {
			return noOfEquipment;
		}

		public void setNoOfEquipment(int noOfEquipment) {
			this.noOfEquipment = noOfEquipment;
		}

		public double getInsuranceAmt() {
			return insuranceAmt;
		}

		public void setInsuranceAmt(double insuranceAmt) {
			this.insuranceAmt = insuranceAmt;
		}

		void display() {
	        System.out.println("Farmer ID: " + farmerId);
	        System.out.println("Farmer Name: " + farmerName);
	        System.out.println("Land Area: " + landArea );
	        System.out.println("City: " + city);
	        System.out.println("Annual Income: " + annualIncome);
	        System.out.println("Number of Equipment: " + noOfEquipment);
	        System.out.println("Insurance Amount: " + insuranceAmt);
	    }
	}// Farmer class ends here

	  class DairyFarmer extends Farmer {

	     int noOfCattles;
	     double milkProducedPerDay; 
	     String dairyLicenceNo;

	  
	     DairyFarmer() // Default constructor
	     {
	         super();
	         this.noOfCattles = 0;
	         this.milkProducedPerDay = 0.0;
	         this.dairyLicenceNo = "Not Given";
	         System.out.println("DairyFarmer Default Constructor Called");
	     }

	     DairyFarmer(int farmerId, String farmerName, double landArea, String city,
	                 double annualIncome, int noOfEquipment, double insuranceAmt,
	                 int noOfCattles, double milkProducedPerDay, String dairyLicenceNo)// Parameterized Constructor

	     {

	         super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt);
	         this.noOfCattles = noOfCattles;
	         this.milkProducedPerDay = milkProducedPerDay;
	         this.dairyLicenceNo = dairyLicenceNo;
	         System.out.println("DairyFarmer Parameterized Constructor Called");
	     }
	     

	     public int getNoOfCattles() {
			return noOfCattles;
		}

		 public void setNoOfCattles(int noOfCattles) {
			 this.noOfCattles = noOfCattles;
		 }

		 public double getMilkProducedPerDay() {
			 return milkProducedPerDay;
		 }

		 public void setMilkProducedPerDay(double milkProducedPerDay) {
			 this.milkProducedPerDay = milkProducedPerDay;
		 }

		 public String getDairyLicenceNo() {
			 return dairyLicenceNo;
		 }

		 public void setDairyLicenceNo(String dairyLicenceNo) {
			 this.dairyLicenceNo = dairyLicenceNo;
		 }

		 void display() {
	         super.display(); 
	         System.out.println("Number of Cattles: " + noOfCattles);
	         System.out.println("Milk Produced Per Day: " + milkProducedPerDay);
	         System.out.println("Dairy Licence No: " + dairyLicenceNo);
	     }
		 void CalSubsidy() {
			 System.out.println("noOfCattles");
		 }
	 }// Dairy class ends here

	  class PoultryFarmer extends Farmer {

	      int noOfChickens;
	      int hens;
	      int noOfShedCapacity;
	      int eggsProducedPerDay;
	      String poultryFarmerName;

	      PoultryFarmer()// default constructor 
	      {
	          super(); 
	          this.noOfChickens = 0;
	          this.hens = 0;
	          this.noOfShedCapacity = 0;
	          this.eggsProducedPerDay = 0;
	          this.poultryFarmerName = "Not Given";
	          System.out.println("PoultryFarmer Default Constructor Called");
	      }

	      PoultryFarmer(int farmerId, String farmerName, double landArea, String city,
	                    double annualIncome, int noOfEquipment, double insuranceAmt,
	                    int noOfChickens, int hens, int noOfShedCapacity, int eggsProducedPerDay,
	                    String poultryFarmerName)// paramterized constructor 
	      {

	          super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt);

	          this.noOfChickens = noOfChickens;
	          this.hens = hens;
	          this.noOfShedCapacity = noOfShedCapacity;
	          this.eggsProducedPerDay = eggsProducedPerDay;
	          this.poultryFarmerName = poultryFarmerName;

	          System.out.println("PoultryFarmer Parameterized Constructor Called");
	      }

	      public int getNoOfChickens() {
			return noOfChickens;
		}

		  public void setNoOfChickens(int noOfChickens) {
			  this.noOfChickens = noOfChickens;
		  }

		  public int getHens() {
			  return hens;
		  }

		  public void setHens(int hens) {
			  this.hens = hens;
		  }

		  public int getNoOfShedCapacity() {
			  return noOfShedCapacity;
		  }

		  public void setNoOfShedCapacity(int noOfShedCapacity) {
			  this.noOfShedCapacity = noOfShedCapacity;
		  }

		  public int getEggsProducedPerDay() {
			  return eggsProducedPerDay;
		  }

		  public void setEggsProducedPerDay(int eggsProducedPerDay) {
			  this.eggsProducedPerDay = eggsProducedPerDay;
		  }

		  public String getPoultryFarmerName() {
			  return poultryFarmerName;
		  }

		  public void setPoultryFarmerName(String poultryFarmerName) {
			  this.poultryFarmerName = poultryFarmerName;
		  }

		  void display() {
	          super.display();
	          System.out.println("Number of Chickens: " + noOfChickens);
	          System.out.println("Number of Hens: " + hens);
	          System.out.println("Shed Capacity: " + noOfShedCapacity);
	          System.out.println("Eggs Produced Per Day: " + eggsProducedPerDay);
	          System.out.println("Poultry Farmer Name: " + poultryFarmerName);
	      }
		  void Subsidy() {
				 System.out.println(" ");
			 }
	  }// PoultyFarmer class ends here

	   class OrganicFarmer extends Farmer {

	      int organicFarmerId;
	      String cropType;
	      String fertilizerUsed;

	      OrganicFarmer() // default constructor
	      {
	          super(); 
	          this.organicFarmerId = 0;
	          this.cropType = "Not Given";
	          this.fertilizerUsed = "Not Given";
	          System.out.println("OrganicFarmer Default Constructor Called");
	      }

	      OrganicFarmer(int farmerId, String farmerName, double landArea, String city,
	                    double annualIncome, int noOfEquipment, double insuranceAmt,
	                    int organicFarmerId, String cropType, String fertilizerUsed)// Parameterized Constructor

	      {

	          super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmt);

	          this.organicFarmerId = organicFarmerId;
	          this.cropType = cropType;
	          this.fertilizerUsed = fertilizerUsed;

	          System.out.println("OrganicFarmer Parameterized Constructor Called");
	      }
	      

	      public int getOrganicFarmerId() {
			return organicFarmerId;
		}

		  public void setOrganicFarmerId(int organicFarmerId) {
			  this.organicFarmerId = organicFarmerId;
		  }

		  public String getCropType() {
			  return cropType;
		  }

		  public void setCropType(String cropType) {
			  this.cropType = cropType;
		  }

		  public String getFertilizerUsed() {
			  return fertilizerUsed;
		  }

		  public void setFertilizerUsed(String fertilizerUsed) {
			  this.fertilizerUsed = fertilizerUsed;
		  }

		  void display() {
	          super.display(); 
	          System.out.println("Organic Farmer ID: " + organicFarmerId);
	          System.out.println("Crop Type: " + cropType);
	          System.out.println("Fertilizer Used: " + fertilizerUsed);
	      }
		  void Produce() {
				 System.out.println("produced goods fertilizerUsed  ");
			 }
	  }//OrganicFarmer class ends here
	   class TestFarmers {
		    public static void main(String[] args) {

		        System.out.println("DairyFarmer");
		        DairyFarmer df = new DairyFarmer(101, "Neha", 12.5, "Pune", 50000.0, 5, 2000.0, 15, 120.5, "DL-12345");
		        df.display();

		        System.out.println("\nPoultryFarmer");
		        PoultryFarmer pf = new PoultryFarmer(102, "Tushar", 5.0, "Nagpur", 40000.0, 3, 1500.0, 200, 150, 2, 120, "Suresh Poultry Farm");
		        pf.display();

		        System.out.println("\nOrganicFarmer");
		        OrganicFarmer of = new OrganicFarmer(103, "shubham"
		        		+ "", 8.5, "Nashik", 60000.0, 4, 3000.0, 1, "Vegetables", "Compost");
		        of.display();
		    }
		}// TestFarmers class ends here