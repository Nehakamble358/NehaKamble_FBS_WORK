package Abstraction;

abstract class Device {

	String deviceName;
	double price;
	String type;

	Device() // default constructor
	{
		System.out.println("Device Default Constructor");
		deviceName = "Smarphone";
		price = 100000;
		type = "Mobile";
	}

	Device(String deviceName, double price, String type) // parameterized
	{
		System.out.println("Device Parameterized Constructor");
		this.deviceName = deviceName;
		this.price = price;
		this.type = type;
	}

	String getDeviceName() {
		return deviceName;
	}

	void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "Device [deviceName=" + this.deviceName + ", price=" + this.price + ", type=" + this.type + "]";
	}

}

// ---------- Mobile Subclass ----------
class Mobile extends Device {
	int storage; // in GB

	int getStorage() {
		return storage;
	}

	void setStorage(int storage) {
		this.storage = storage;
	}

	Mobile() {
		storage = 128;
	}

	Mobile(String brand, double price, int storage) {
		super("Mobile Phone", price, "Smart Device");
		this.storage = storage;
	}

	public Mobile(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "Mobile [storage=" + this.storage + "]";
	}
}

	// ---------- Laptop Subclass ----------
	class Laptop extends Device {
		String processor;

		Laptop() {
			processor = "HP i5 16th Gen";
		}

		Laptop(String DeviceName, double price, String processor) {
			super("Laptop", price, "Computer Device");
			this.processor = processor;
		}

		String getProcessor() {
			return processor;
		}

		void setProcessor(String processor) {
			this.processor = processor;
		}

		@Override
		public String toString() {
			return super.toString() + "Laptop [processor =" + this.processor + "]";
		}

	}

	// ---------- Television Subclass ----------
	class Television extends Device {
		int screenSize; // inches

		int getScreenSize() {
			return screenSize;
		}

		void setScreenSize(int screenSize) {
			this.screenSize = screenSize;
		}

		Television() {
			screenSize = 42;
		}

		Television(String DeviceName, double price, int screenSize) {
			super("Television", price, "Entertainment Device");
			this.screenSize = screenSize;
		}

		@Override
		public String toString() {
			return super.toString() + "Television [screenSize= " + this.screenSize + "]";
		}
	}

	// ---------- Test Class ----------
	class TestDevices {
		    public static void main(String[] args) {
		        Device d;

		        System.out.println("--- Mobile ---");
		        d = new Mobile("OnePlus 15", 72,999);
		        System.out.println(d.toString());
		        
		        System.out.println("\n--- Laptop ---");
		        d = new Laptop("HP", 65000, "Intel i7");
		        System.out.println(d.toString());

		        System.out.println("\n--- Television ---");
		        d = new Television("Sony", 55000, 42);
		        System.out.println(d.toString());
		    }
		}
