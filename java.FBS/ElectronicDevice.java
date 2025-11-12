package inheritanceDemo;

public class ElectronicDevice {
	// Base class
	    String brand;
	   String model;
	    double price;

	    // Default constructor
	    ElectronicDevice() {
	        this.brand = "Unknown";
	        this.model = "Unknown";
	        this.price = 0.0;
	    }

	    // Parameterized constructor
	    ElectronicDevice(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	    }

	    // Getters and Setters
	    String getBrand() {
	        return brand;
	    }

	   void setBrand(String brand) {
	        this.brand = brand;
	    }

	    String getModel() {
	        return model;
	    }

	     void setModel(String model) {
	        this.model = model;
	    }

	     double getPrice() {
	        return price;
	    }

	     void setPrice(double price) {
	        if(price >= 0) this.price = price;
	        else System.out.println("Price cannot be negative.");
	    }

	    // Display method
	    void display() {
	        System.out.println("Brand : " + brand);
	        System.out.println("Model : " + model);
	        System.out.println("Price : $" + price);
	    }
	}

	// Derived class 1
class Laptop extends ElectronicDevice {
	     int ram; // in GB
	     int storage; // in GB

	    // Default constructor
	    Laptop() {
	        super();
	        this.ram = 8;
	        this.storage = 256;
	    }

	    // Parameterized constructor
	    Laptop(String brand, String model, double price, int ram, int storage) {
	        super(brand, model, price);
	        this.ram = ram;
	        this.storage = storage;
	    }

	    // Getters and Setters
	    int getRam() {
	        return ram;
	    }

	     void setRam(int ram) {
	        if(ram > 0) this.ram = ram;
	        else System.out.println("RAM must be positive.");
	    }
	     int getStorage() {
	        return storage;
	    }

	     void setStorage(int storage) {
	        if(storage > 0) this.storage = storage;
	        else System.out.println("Storage must be positive.");
	    }

	    // Override display
	     void display() {
	        super.display();
	        System.out.println("RAM     : " + ram + " GB");
	        System.out.println("Storage : " + storage + " GB");
	    }

	     void bootUp() {
	        System.out.println(getBrand() + " " + getModel() + " is booting up...");
	    }
	}

	// Derived class 2
class Smartphone extends ElectronicDevice {
	     int batteryCapacity; // in mAh
	     boolean is5G; // 5G capable or not

	    // Default constructor
	     Smartphone() {
	        super();
	        this.batteryCapacity = 3000;
	        this.is5G = false;
	    }

	    // Parameterized constructor
	     Smartphone(String brand, String model, double price, int batteryCapacity, boolean is5G) {
	        super(brand, model, price);
	        this.batteryCapacity = batteryCapacity;
	        this.is5G = is5G;
	    }

	    // Getters and Setters
	     int getBatteryCapacity() {
	        return batteryCapacity;
	    }

	    void setBatteryCapacity(int batteryCapacity) {
	        if(batteryCapacity > 0) this.batteryCapacity = batteryCapacity;
	        else System.out.println("Battery capacity must be positive.");
	    }

	     boolean isIs5G() {
	        return is5G;
	    }

	     void setIs5G(boolean is5G) {
	        this.is5G = is5G;
	    }

	    // Override display
	     void display() {
	        super.display();
	        System.out.println("Battery Capacity : " + batteryCapacity + " mAh");
	        System.out.println("5G Capable       : " + (is5G ? "Yes" : "No"));
	    }

	    // Unique method
	    void makeCall(String contact) {
	        System.out.println(getBrand() + " " + getModel() + " is calling " + contact + "...");
	    }
	}

	// Derived class 3 (multilevel inheritance)
class GamingLaptop extends Laptop {
	     String gpu; // graphics card
	     boolean rgbKeyboard;

	    // Default constructor
	    GamingLaptop() {
	        super();
	        this.gpu = "Integrated";
	        this.rgbKeyboard = false;
	    }

	    // Parameterized constructor
	    GamingLaptop(String brand, String model, double price, int ram, int storage, String gpu, boolean rgbKeyboard) {
	        super(brand, model, price, ram, storage);
	        this.gpu = gpu;
	        this.rgbKeyboard = rgbKeyboard;
	    }

	    // Getters and Setters
	    String getGpu() {
	        return gpu;
	    }

	     void setGpu(String gpu) {
	        this.gpu = gpu;
	    }

	     boolean isRgbKeyboard() {
	        return rgbKeyboard;
	    }

	     void setRgbKeyboard(boolean rgbKeyboard) {
	        this.rgbKeyboard = rgbKeyboard;
	    }

	    // Override display
	    @Override
	     void display() {
	        super.display();
	        System.out.println("GPU             : " + gpu);
	        System.out.println("RGB Keyboard    : " + (rgbKeyboard ? "Yes" : "No"));
	    }

	    // Unique method
	    void playGame(String game) {
	        System.out.println(getBrand() + " " + getModel() + " is playing " + game + " with high performance!");
	    }
	}

	// Main class
class ElectronicDeviceTest {
	    public static void main(String[] args) {
	        // Using default constructor
	        Laptop laptop1 = new Laptop();
	        laptop1.setBrand("Dell");
	        laptop1.setModel("Inspiron");
	        laptop1.setPrice(800);

	        // Using parameterized constructor
	        Smartphone phone1 = new Smartphone("Samsung", "Galaxy S21", 999, 4000, true);

	        GamingLaptop gamingLaptop1 = new GamingLaptop("Asus", "ROG Strix", 2500, 32, 1000, "RTX 3080", true);

	        // Display info and use unique methods
	        System.out.println("---- Laptop ----");
	        laptop1.display();
	        laptop1.bootUp();

	        System.out.println("\n---- Smartphone ----");
	        phone1.display();
	        phone1.makeCall("Alice");

	        System.out.println("\n---- Gaming Laptop ----");
	        gamingLaptop1.display();
	        gamingLaptop1.bootUp();
	        gamingLaptop1.playGame("Cyberpunk 2077");
	    }
	}


