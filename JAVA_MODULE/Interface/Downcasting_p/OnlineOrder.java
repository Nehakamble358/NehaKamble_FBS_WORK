package downcasting;

interface Order {
	void display();
}

// abstract class
abstract class OnlineOrder implements Order {

	int orderId;
	String customerName;
	double amount;

	OnlineOrder() {
	}

	OnlineOrder(int orderId, String customerName, double amount) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}

	public void display() {
		System.out.println("Order ID : " + orderId);
		System.out.println("Customer : " + customerName);
		System.out.println("Amount : " + amount);
	}
}

// Food Order
class FoodOrder extends OnlineOrder {

	double deliveryCharge;

	FoodOrder(int orderId, String customerName, double amount, double deliveryCharge) {
		super(orderId, customerName, amount);
		this.deliveryCharge = deliveryCharge;
	}

	public void display() {
		super.display();
		System.out.println("Delivery Charge : " + deliveryCharge);
	}
}

// Electronics Order
class ElectronicsOrder extends OnlineOrder {

	double warrantyCharge;

	ElectronicsOrder(int orderId, String customerName, double amount, double warrantyCharge) {
		super(orderId, customerName, amount);
		this.warrantyCharge = warrantyCharge;
	}

	public void display() {
		super.display();
		System.out.println("Warranty Charge : " + warrantyCharge);
	}
}

// Clothing Order
class ClothingOrder extends OnlineOrder {

	double giftWrapCharge;

	ClothingOrder(int orderId, String customerName, double amount, double giftWrapCharge) {
		super(orderId, customerName, amount);
		this.giftWrapCharge = giftWrapCharge;
	}

	public void display() {
		super.display();
		System.out.println("Gift Wrap Charge : " + giftWrapCharge);
	}
}

// Main class
class DemoOrder {

	public static void main(String[] args) {

		processOrder(new FoodOrder(501, "Trisha", 800, 50));
		processOrder(new ElectronicsOrder(502, "Satvik", 30000, 2000));
		processOrder(new ClothingOrder(503, "Sonali", 2500, 100));
	}

	static void processOrder(Order o) {

		if (o instanceof FoodOrder) {
			FoodOrder f = (FoodOrder) o; 
			f.amount += f.deliveryCharge;
			System.out.println("\nFood Order Processed\n");
			f.display();
			
		} else if (o instanceof ElectronicsOrder) {
			ElectronicsOrder e = (ElectronicsOrder) o; 
			e.amount += e.warrantyCharge;
			System.out.println("\nElectronics Order Processed\n");
			e.display();
			
		} else if (o instanceof ClothingOrder) {
			ClothingOrder c = (ClothingOrder) o; 
			c.amount += c.giftWrapCharge;
			System.out.println("\nClothing Order Processed\n");
			c.display();
		}
	}
}
