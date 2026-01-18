package downcasting;

interface Vehicle {
	void display();
}

// abstract class
abstract class Transport implements Vehicle {

	int vehicleNo;
	String brand;
	double price;

	Transport() {
	}

	Transport(int vehicleNo, String brand, double price) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.price = price;
	}

	public void display() {
		System.out.println("Vehicle No : " + vehicleNo);
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
	}
}

// Car
class Car extends Transport {

	double insurance;

	Car() {
		insurance = 5000;
		System.out.println("Car Default Constructor");
	}

	Car(int vehicleNo, String brand, double price, double insurance) {
		super(vehicleNo, brand, price);
		this.insurance = insurance;
		System.out.println("Car Parameterized Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Insurance : " + insurance);
	}
}

// Bike
class Bike extends Transport {

	double helmetCost;

	Bike() {
		helmetCost = 1500;
		System.out.println("Bike Default Constructor");
	}

	Bike(int vehicleNo, String brand, double price, double helmetCost) {
		super(vehicleNo, brand, price);
		this.helmetCost = helmetCost;
		System.out.println("Bike Parameterized Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Helmet Cost : " + helmetCost);
	}
}

// Truck
class Truck extends Transport {

	double loadingCharge;

	Truck() {
		loadingCharge = 8000;
		System.out.println("Truck Default Constructor");
	}

	Truck(int vehicleNo, String brand, double price, double loadingCharge) {
		super(vehicleNo, brand, price);
		this.loadingCharge = loadingCharge;
		System.out.println("Truck Parameterized Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Loading Charge : " + loadingCharge);
	}
}

// Main class
class DemoV1 {

	public static void main(String[] args) {

		giveService(new Car(11, "Honda", 800000, 6000));
		giveService(new Bike(22, "Yamaha", 120000, 2000));
		giveService(new Truck(33, "Tata", 1500000, 10000));
	}

	static void giveService(Vehicle v) {

		if (v instanceof Car) {
			Car c = (Car) v; // downcasting
			c.insurance += 2000;
			System.out.println("\nCar Service Done\n");
			c.display();
		} else if (v instanceof Bike) {
			Bike b = (Bike) v; // downcasting
			b.helmetCost += 500;
			System.out.println("\nBike Service Done\n");
			b.display();
		} else if (v instanceof Truck) {
			Truck t = (Truck) v; // downcasting
			t.loadingCharge += 3000;
			System.out.println("\nTruck Service Done\n");
			t.display();
		}
	}
}
