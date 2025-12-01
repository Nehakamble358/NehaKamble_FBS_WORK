package Abstraction;

abstract class Defence {
	int numberofDept;
	int numberofVehicle;
	int numberOfBases;
	int numberOfTroops;
	String manPowerCount;
	String casualties;
	String NameOfHead;
	String locationOfHeadQuality;
	String counterName;

	Defence() {
		numberofDept = 5;
		numberofVehicle = 517;
		numberOfBases = 12;
		numberOfTroops = 8500;
		manPowerCount = "High or 9500 soldiers";
		casualties = "12 injured 1 dead";
		NameOfHead = "General Arjun Singh";
		locationOfHeadQuality = "New Delhi HQ";
		counterName = "India";
	}

	Defence(int numberofDept, int numberofVehicle, int numberOfBases, int numberOfTroops, String manPowerCount,
			String casualties, String NameOfHead, String locationOfHeadQuality, String counterName) {

		this.numberofDept = numberofDept;
		this.numberofVehicle = numberofVehicle;
		this.numberOfBases = numberOfBases;
		this.numberOfTroops = numberOfTroops;
		this.manPowerCount = manPowerCount;
		this.casualties = casualties;
		this.NameOfHead = NameOfHead;
		this.locationOfHeadQuality = locationOfHeadQuality;
		this.counterName = counterName;
	}

	/*
	 * void display() { System.out.println("NumberofDept : " + numberofDept);
	 * System.out.println("NumberofVehicle : " + numberofVehicle);
	 * System.out.println("NumberOfBases : " + numberOfBases);
	 * System.out.println("NumberOfTroops : " + numberOfTroops);
	 * System.out.println("ManPowerCount : " + manPowerCount);
	 * System.out.println("Casualties : " + casualties);
	 * System.out.println("NameOfHead : " + NameOfHead);
	 * System.out.println("LocationOfHeadQuality : " + locationOfHeadQuality);
	 * System.out.println("CounterName : " + counterName); }
	 */

	void Attrack() {
		System.out.println("Defence Attack Initiated");
	}

	@Override
	public String toString() {
		return "Defence [numberofDept=" + this.numberofDept + ", numberofVehicle=" + this.casualties
				+ ", numberOfBases=" + this.numberOfBases + ", numberOfTroops=" + this.numberOfTroops
				+ ", manPowerCount=" + this.manPowerCount + ", casualties=" + this.casualties + ", NameOfHead="
				+ this.NameOfHead + ", locationOfHeadQuality=" + this.locationOfHeadQuality + ", counterName="
				+ this.casualties + "]";
	}

}
// ---------------- Army ----------------

class Army extends Defence {
	int numOfTools;
	int numOfGuns;
	int numOfGeunads;
	int numOfBatalin;

	Army() {
		numOfTools = 5;
		numOfGuns = 120;
		numOfGeunads = 12;
		numOfBatalin = 8500;
	}

	Army(int numOfTools, int numOfGuns, int numOfGeunads, int numOfBatalin) {
		super();
		this.numOfTools = numOfTools;
		this.numOfGuns = numOfGuns;
		this.numOfGeunads = numOfGeunads;
		this.numOfBatalin = numOfBatalin;
	}

	/*
	 * void display() { System.out.println("Army Tools : " + numOfTools);
	 * System.out.println("Army Guns : " + numOfGuns);
	 * System.out.println("Army Grenades : " + numOfGeunads);
	 * System.out.println("Army Battalion Strength : " + numOfBatalin); }
	 */

	@Override
	public String toString() {
		return super.toString() + "Army [numOfTools=" + this.numOfTools + ", numOfGuns=" + this.numOfGuns
				+ ", numOfGeunads=" + this.numOfGeunads + ", numOfBatalin=" + this.numOfBatalin + "]";
	}

	void display() {
		// TODO Auto-generated method stub

	}

}

// ---------------- Navy ----------------

class Navy extends Defence {
	int numOfShips;
	int numOfSubmarines;
	int numOfTorpedoes;

	Navy() {
		numOfShips = 234;
		numOfSubmarines = 567;
		numOfTorpedoes = 907;
	}

	Navy(int numOfShips, int numOfSubmarines, int numOfTorpedoes) {
		super();
		this.numOfShips = numOfShips;
		this.numOfSubmarines = numOfSubmarines;
		this.numOfTorpedoes = numOfTorpedoes;
	}

	/*
	 * void display() { System.out.println("Navy Ships : " + numOfShips);
	 * System.out.println("Navy Submarines : " + numOfSubmarines);
	 * System.out.println("Navy Torpedoes : " + numOfTorpedoes); }
	 */

	void Attrack() {
		System.out.println("Launching Torpedoes!");
	}

	@Override
	public String toString() {
		return "Navy [numOfShips=" + this.numOfShips + ", numOfSubmarines=" + this.numOfSubmarines + ", numOfTorpedoes="
				+ this.numOfTorpedoes + "]";
	}

	void display() {
		// TODO Auto-generated method stub

	}

}

// ---------------- Air Force ----------------

class Air extends Defence {
	int numOfMission;
	int aircraftId;
	int numOfSquadron;

	Air() {
		numOfMission = 25;
		numOfSquadron = 15;
	}

	Air(int numOfMission, int aircraftId, int numOfSquadron) {
		super();
		this.numOfMission = numOfMission;
		this.aircraftId = aircraftId;
		this.numOfSquadron = numOfSquadron;
	}

	void Attrack() {
		System.out.println("Air Mission Launched!");
	}

	@Override
	public String toString() {
		return super.toString() + "Air [numOfMission=" + this.numOfMission + ", aircraftId=" + this.aircraftId
				+ ", numOfSquadron=" + this.numOfSquadron + "]";
	}

	void display() {
		// TODO Auto-generated method stub

	}

}

// ---------------- Main Class ----------------

class DemoDefence {
	public static void main(String[] args) {

		Defence d1;

		System.out.println("------ Army -------");
		d1 = new Army(5, 120, 12, 8500);

		System.out.println(d1.toString());

		System.out.println("\n------ Navy -------");
		d1 = new Navy(234, 567, 907);

		System.out.println(d1.toString());

		System.out.println("\n------ Air Force -------");
		d1 = new Air(25, 101, 15);

		System.out.println(d1.toString());
	}
}
