package inheritanceDemo;

public class Vehicle {
    String brand;
    String model;
    String vehicleNumber;
    String color;
    double price;
    int speed;
    String fuelType;
    double mileage;
    int yearOfManufacture;

    Vehicle() {//default constructor
        System.out.println("Vehicle default constructor");
        brand = "Unknown";
        model = "Unknown";
        vehicleNumber = "Not Registered";
        color = "White";
        price = 0.0;
        speed = 0;
        fuelType = "Unknown";
        mileage = 0.0;
        yearOfManufacture = 2025;
    }

    Vehicle(String brand, String model, String vehicleNumber, String color,
            double price, int speed, String fuelType, double mileage, int yearOfManufacture)//parameterized constructor
    {
        System.out.println("Vehicle parameterized constructor");
        this.brand = brand;
        this.model = model;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.yearOfManufacture = yearOfManufacture;
    }

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

	 String getVehicleNumber() {
		return vehicleNumber;
	}

	 void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	 String getColor() {
		return color;
	}

	 void setColor(String color) {
		this.color = color;
	}

	 double getPrice() {
		return price;
	}

	 void setPrice(double price) {
		this.price = price;
	}

	 int getSpeed() {
		return speed;
	}

	 void setSpeed(int speed) {
		this.speed = speed;
	}

	 String getFuelType() {
		return fuelType;
	}

	 void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	 double getMileage() {
		return mileage;
	}

	 void setMileage(double mileage) {
		this.mileage = mileage;
	}

	 int getYearOfManufacture() {
		return yearOfManufacture;
	}

	 void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Year: " + yearOfManufacture);
    }
}//vehicle class ends here


class Car extends Vehicle {
    int seats;
    String transmission;
    boolean sunroof;
    Car()
    {
    	super();
    	  System.out.println("car default constructor");
    	seats=4;
    	sunroof=true;
    }
    Car(String brand, String model, String vehicleNumber, String color,
        double price, int speed, String fuelType, double mileage, int yearOfManufacture,
        int seats,  boolean sunroof)//parameterized constructor
    {

        super(brand, model, vehicleNumber, color, price, speed, fuelType, mileage, yearOfManufacture);
        System.out.println("Car parameterized constructor");
        this.seats = seats;
        this.sunroof = sunroof;
    }
    

     int getSeats() {
		return seats;
	}


	 void setSeats(int seats) {
		this.seats = seats;
	}

	 boolean isSunroof() {
		return sunroof;
	}


	 void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}


	void display() {
        super.display();
        System.out.println("Seats: " + seats);
        System.out.println("Sunroof: " + (sunroof ? "Yes" : "No"));
    }
	
		
}//  Car class ends here

class Bike extends Vehicle {
    int engineCCapacity;
    boolean anticlockbike;
    Bike()
    {
    	super();
    	  System.out.println("bike default constructor");
    	  engineCCapacity=46;
    	  anticlockbike=true;
    }
    Bike(String brand, String model, String vehicleNumber, String color,
         double price, int speed, String fuelType, double mileage, int yearOfManufacture,
         int engineCCapacity, boolean anticlockbike) {

        super(brand, model, vehicleNumber, color, price, speed, fuelType, mileage, yearOfManufacture);
        System.out.println("Bike parameterized constructor");
        this.engineCCapacity = engineCCapacity;
        this.anticlockbike = anticlockbike;
    }
    
     int getEngineCCapacity() {
		return engineCCapacity;
	}
	 void setEngineCCapacity(int engineCCapacity) {
		this.engineCCapacity = engineCCapacity;
	}
	 boolean isAnticlockbike() {
		return anticlockbike;
	}
	 void setAnticlockbike(boolean anticlockbike) {
		this.anticlockbike = anticlockbike;
	}
	void display() {
        super.display();
        System.out.println("Engine CC: " + engineCCapacity);
        System.out.println("ABS: " + (anticlockbike ? "Yes" : "No"));
    }
	
	
}//  Bike class ends here

class Truck extends Vehicle {
    double loadCapacity;
    int noOfWheels;
    Truck()
    {
    	super();
    	  System.out.println("truck default constructor");
    	  loadCapacity=4.8;
    	  noOfWheels=12;
    }
    Truck(String brand, String model, String vehicleNumber, String color,
          double price, int speed, String fuelType, double mileage, int yearOfManufacture,
          double loadCapacity, int noOfWheels) {

        super(brand, model, vehicleNumber, color, price, speed, fuelType, mileage, yearOfManufacture);
        System.out.println("Truck parameterized constructor");
        this.loadCapacity = loadCapacity;
        this.noOfWheels = noOfWheels;
    }

     double getLoadCapacity() {
		return loadCapacity;
	}
	 void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	 int getNoOfWheels() {
		return noOfWheels;
	}
	 void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	void display() {
        super.display();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Number of Wheels: " + noOfWheels);
	}
	
	
}//  Truck class ends here

class DemoVehicle {
    public static void main(String[] args) {
    	Vehicle c1; // common reference variable

        c1 = new Car("Tata", "Nexon", "MH12AB1234", "Blue",
                     1200000, 180, "Petrol", 18.5, 2024, 5, true);
        c1.display();

        System.out.println("\n");

        c1 = new Bike("Yamaha", "R15", "MH09XY4321", "Black",
                      165000, 150, "Petrol", 45.0, 2023, 155, true);
        c1.display();

        System.out.println("\n");

        c1 = new Truck("Ashok Leyland", "CargoX", "MH14TR9087", "White",
                       2500000, 120, "Diesel", 8.0, 2022, 16.5, 12);
        c1.display();
        
    }
}

