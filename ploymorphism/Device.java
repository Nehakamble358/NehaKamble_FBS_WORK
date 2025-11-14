package PolymorephismDemo;

public class Device {
	 String deviceName;
	    String brand;
	    double price;
	    String type;
	    
	     String getDeviceName() {
			return deviceName;
		}

		 void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		 String getBrand() {
			return brand;
		}

		 void setBrand(String brand) {
			this.brand = brand;
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

		Device() // default constructor
	    {
	        System.out.println("Device Default Constructor");
	        deviceName = "Smarphone";
	        brand = "Apple";
	        price = 100000;
	        type = "Mobile";
	    }

	    Device(String deviceName, String brand, double price, String type) // parameterized
	    {
	        System.out.println("Device Parameterized Constructor");
	        this.deviceName = deviceName;
	        this.brand = brand;
	        this.price = price;
	        this.type = type;
	    }

	    void operate() {
	        System.out.println(deviceName + " is operating...");
	    }

	    void display() {
	        System.out.println("Device Name: " + deviceName);
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: ₹" + price);
	        System.out.println("Type: " + type);
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
		Mobile(){
	     storage = 128;
	    }
	    Mobile(String brand, double price, int storage) {
	        super("Mobile Phone", brand, price, "Smart Device");
	        this.storage = storage;
	    }

	    void display() {
	        super.display();
	        System.out.println("Storage: " + storage + "GB");
	    }
	    void operate() {
	        System.out.println("📱 Mobile is being used for calls, apps, and internet.");
	    }
	}

	// ---------- Laptop Subclass ----------
	class Laptop extends Device {
	    String processor;
	    
	     String getProcessor() {
			return processor;
		}

		 void setProcessor(String processor) {
			this.processor = processor;
		}

		Laptop(){
	    	processor="HP i5 16th Gen";
	    }

	    Laptop(String brand, double price, String processor) {
	        super("Laptop", brand, price, "Computer Device");
	        this.processor = processor;
	    }

	    void display() {
	        super.display();
	        System.out.println("Processor: " + processor);
	    }
	    void operate() {
	        System.out.println("💻 Laptop is running multiple applications.");
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

		Television(){
	    	screenSize = 42;
	    }
	    
	    Television(String brand, double price, int screenSize) {
	        super("Television", brand, price, "Entertainment Device");
	        this.screenSize = screenSize;
	    }

	    void display() {
	        super.display();
	        System.out.println("Screen Size: " + screenSize + " inches");
	    }
	    void operate() {
	        System.out.println("📺 Television is displaying HD channels.");
	    
	}

	// ---------- Test Class ----------
	class TestDevices {
	    public static void main(String[] args) {
	        Device d;

	        System.out.println("--- Mobile ---");
	        d = new Mobile("Samsung", 25000, 128);
	        d.display();
	        d.operate();

	        System.out.println("\n--- Laptop ---");
	        d = new Laptop("HP", 65000, "Intel i7");
	        d.display();
	        d.operate();

	        System.out.println("\n--- Television ---");
	        d = new Television("Sony", 55000, 42);
	        d.display();
	        d.operate();
	    }
	}

}
