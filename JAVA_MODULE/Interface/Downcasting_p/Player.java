package downcasting;

interface GameObject {
	void display();
}

// abstract class
abstract class Player implements GameObject {

	int playerId;
	String name;
	int power;

	Player() {
	}

	Player(int playerId, String name, int power) {
		this.playerId = playerId;
		this.name = name;
		this.power = power;
	}

	public void display() {
		System.out.println("Player ID : " + playerId);
		System.out.println("Name : " + name);
		System.out.println("Power : " + power);
	}
}

// Warrior class
class Warrior extends Player {

	int strength;

	Warrior(int playerId, String name, int power, int strength) {
		super(playerId, name, power);
		this.strength = strength;
	}

	public void display() {
		super.display();
		System.out.println("Strength : " + strength);
	}
}

// Mage class
class Mage extends Player {

	int magic;

	Mage(int playerId, String name, int power, int magic) {
		super(playerId, name, power);
		this.magic = magic;
	}

	public void display() {
		super.display();
		System.out.println("Magic : " + magic);
	}
}

// Archer class
class Archer extends Player {

	int accuracy;

	Archer(int playerId, String name, int power, int accuracy) {
		super(playerId, name, power);
		this.accuracy = accuracy;
	}

	public void display() {
		super.display();
		System.out.println("Accuracy : " + accuracy);
	}
}

// Main class
class DemoGame {

	public static void main(String[] args) {

		applyPowerUp(new Warrior(1, "Neha", 100, 50));
		applyPowerUp(new Mage(2, "Tushar", 90, 70));
		applyPowerUp(new Archer(3, "Nikita", 95, 60));
	}

	static void applyPowerUp(GameObject g) {

		if (g instanceof Warrior) {
			Warrior w = (Warrior) g; // downcasting
			w.power += 20;
			w.strength += 10;
			System.out.println("\nWarrior Power-Up Applied\n");
			w.display();
			
		} else if (g instanceof Mage) {
			Mage m = (Mage) g;
			m.power += 25;
			m.magic += 15;
			System.out.println("\nMage Power-Up Applied\n");
			m.display();
			
		} else if (g instanceof Archer) {
			Archer a = (Archer) g;
			a.power += 15;
			a.accuracy += 20;
			System.out.println("\nArcher Power-Up Applied\n");
			a.display();
		}
	}
}
