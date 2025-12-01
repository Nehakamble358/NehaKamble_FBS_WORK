package inheritanceDemo;

public class Defence {
	int numberofDept;
	int numberofVehicle;
	int numberOfBases;
	int numberOfTroops;
	String missionPerformad;
	String manPowerCount;
	String casualties;
	String NameOfHead;
	String locationOfHeadQuality;
	String counterName;

	Defence() { // default contructor
		numberofDept = 5;
		numberofVehicle = 517;
		numberOfBases = 12;
		numberOfTroops = 8500;
		manPowerCount = "High or 9500 soldiers";
		casualties = "12 injured 1 dead";
		NameOfHead = "General arjun singh";
		locationOfHeadQuality = "New delhi HQ";
		counterName = "India";
	}

	Defence(int numberofDept, int numberofVehicle, int numberOfBases, int numberOfTroops, String manPowerCount,
			String casualties, String nameOfHead, String locationOfHeadQuality, String counterName) { // parameterized
																										// constructor
		this.numberofDept = numberofDept;
		this.numberofVehicle = numberofVehicle;
		this.numberOfBases = numberOfBases;
		this.numberOfTroops = numberOfTroops;
		this.manPowerCount = manPowerCount;
		this.casualties = casualties;
		this.NameOfHead = nameOfHead;
		this.locationOfHeadQuality = locationOfHeadQuality;
		this.counterName = counterName;
	}

	int getNumberofDept() {
		return numberofDept;
	}

	void setNumberofDept(int numberofDept) {
		this.numberofDept = numberofDept;
	}

	int getNumberofVehicle() {
		return numberofVehicle;
	}

	void setNumberofVehicle(int numberofVehicle) {
		this.numberofVehicle = numberofVehicle;
	}

	int getNumberOfBases() {
		return numberOfBases;
	}

	void setNumberOfBases(int numberOfBases) {
		this.numberOfBases = numberOfBases;
	}

	int getNumberOfTroops() {
		return numberOfTroops;
	}

	void setNumberOfTroops(int numberOfTroops) {
		this.numberOfTroops = numberOfTroops;
	}

	String getManPowerCount() {
		return manPowerCount;
	}

	void setManPowerCount(String manPowerCount) {
		this.manPowerCount = manPowerCount;
	}

	String getCasualties() {
		return casualties;
	}

	void setCasualties(String casualties) {
		this.casualties = casualties;
	}

	String getNameOfHead() {
		return NameOfHead;
	}

	void setNameOfHead(String nameOfHead) {
		NameOfHead = nameOfHead;
	}

	String getLocationOfHeadQuality() {
		return locationOfHeadQuality;
	}

	void setLocationOfHeadQuality(String locationOfHeadQuality) {
		this.locationOfHeadQuality = locationOfHeadQuality;
	}

	String getCounterName() {
		return counterName;
	}

	void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	void display() {
		System.out.println("NumberofDept :" + numberofDept);
		System.out.println("NumberofVehicle :" + numberofVehicle);
		System.out.println("NumberOfBases :" + numberOfBases);
		System.out.println("NumberOfTroops :" + numberOfTroops);
		System.out.println("ManPowerCount :" + manPowerCount);
		System.out.println("Casualties: " + casualties);
		System.out.println("NameOfHead:" + NameOfHead);
		System.out.println("LocationOfHeadQuality :" + locationOfHeadQuality);
		System.out.println("CounterName:" + counterName);

	}

}// Defence class ends here

class Army extends Defence {
	int numOfTools;
	int numOfGuns;
	int numOfGeunads;
	int numOfbataline;

	Army() {
		
		numOfTools = 5;
		numOfGuns = 120;
		numOfGeunads = 12;
		numOfbataline = 8500;
	}

	Army(int numOfTools, int numOfGuns, int numOfGeunads, int numOfbatalin) {
		super();
		this.numOfTools = numOfTools;
		this.numOfGuns = numOfGuns;
		this.numOfGeunads = numOfGeunads;
		this.numOfbatalin = numOfbatalin;
	}

	int getNumOfTools() {
		return numOfTools;
	}

	void setNumOfTools(int numOfTools) {
		this.numOfTools = numOfTools;
	}

	int getNumOfGuns() {
		return numOfGuns;
	}

	void setNumOfGuns(int numOfGuns) {
		this.numOfGuns = numOfGuns;
	}

	int getNumOfGeunads() {
		return numOfGeunads;
	}

	void setNumOfGeunads(int numOfGeunads) {
		this.numOfGeunads = numOfGeunads;
	}

	int getNumOfbatalin() {
		return numOfbatalin;
	}

	void setNumOfbatalin(int numOfbatalin) {
		this.numOfbatalin = numOfbatalin;
	}

	int numOfbatalin;

	void display() {
		System.out.println("NumOfTools is:" + numOfTools);
		System.out.println("NumOfGuns is:" + numOfGuns);
		System.out.println("NumOfGeunads is:" + numOfGeunads);
		System.out.println("NumOfBatalin is" + numOfbatalin);
	}
	 void Attrack(){
		System.out.println("Guns");
	}

}// class Army ends here.

class Navy extends Defence {
	int numOfShipe;
	int numOfSubmarirns;
	int numOfTorpedoes;

	Navy() {
		numOfShipe = 234;
		numOfSubmarirns = 567;
		numOfTorpedoes = 907;

	}

	Navy(int numOfShipe, int numOfSubmarirns, int numOfTorpedoes) {
		super();
		this.numOfShipe = numOfShipe;
		this.numOfSubmarirns = numOfSubmarirns;
		this.numOfTorpedoes = numOfTorpedoes;
	}

	int getNumOfShipe() {
		return numOfShipe;
	}

	void setNumOfShipe(int numOfShipe) {
		this.numOfShipe = numOfShipe;
	}

	int getNumOfSubmarirns() {
		return numOfSubmarirns;
	}

	void setNumOfSubmarirns(int numOfSubmarirns) {
		this.numOfSubmarirns = numOfSubmarirns;
	}

	int getNumOfTorpedoes() {
		return numOfTorpedoes;
	}

	void setNumOfTorpedoes(int numOfTorpedoes) {
		this.numOfTorpedoes = numOfTorpedoes;
	}

	void display() {
		System.out.println("NumOfShipe is :" + numOfShipe);
		System.out.println("NumOfSubmarirns is :" + numOfSubmarirns);
		System.out.println("NumTorpedoes is:" + numOfTorpedoes);

	}
	void Attrack(){
		System.out.println("Torpedoes");
	}


}// Army class ends here

class Air extends Defence {
	int numOfMission;
	int AircraftId;
	int numOfSquadron;

	Air() {
		numOfMission = 25;
		numOfSquadron = 15;
	}

	public Air(int numOfMission, int aircraftid, int numOfSqyadron) {
		super();
		this.numOfMission = numOfMission;
		this.numOfSquadron = numOfSquadron;
	}

	int getNumOfMission() {
		return numOfMission;
	}

	void setNumOfMission(int numOfMission) {
		this.numOfMission = numOfMission;
	}

	int getNumOfSquadron() {
		return numOfSquadron;
	}

	void setNumOfSquadron(int numOfSquadron) {
		this.numOfSquadron = numOfSquadron;
	}

	void display() {
		System.out.println("numOfMission is:" + numOfMission);
		System.out.println("numOfSquadron is:" + numOfSquadron);
	}
	void Attrack(){
		System.out.println("Mission");
	}

}

class DemoDefence {
	public static void main(String[] args) {
		System.out.println("--- Using Parameterized Constructors ---");
		Army a = new Army(5, 120, 12, 8500);

		a.display();
		System.out.println("\n");

		Navy n = new Navy(234, 567, 907);

		n.display();
		System.out.println("\n");
	}
}
