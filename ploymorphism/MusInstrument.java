package PolymorephismDemo;

public class MusInstrument {
	String instrumentName;
    String type;
    String brand;
    double price;

    // Default Constructor
    MusInstrument() {
        System.out.println("Default MusicalInstrument Constructor");
        instrumentName = "Unknown";
        type = "Not specified";
        brand = "Generic";
        price = 0.0;
    }

    // Parameterized Constructor
    MusInstrument(String instrumentName, String type, String brand, double price) {
        System.out.println("Parameterized MusicalInstrument Constructor");
        this.instrumentName = instrumentName;
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

     String getInstrumentName() {
		return instrumentName;
	}

	 void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	 String getType() {
		return type;
	}

	 void setType(String type) {
		this.type = type;
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

	void display() {
        System.out.println("Instrument Name: " + instrumentName);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }
    void playSound() {
        System.out.println(instrumentName + " is playing music...");
    }
}

// ---------------- Guitar Class ----------------
class Guitar extends MusInstrument {
    int noOfStrings;
    

     Guitar(int noOfStrings) {
		super();
		this.noOfStrings = 6;
	}

	Guitar(String brand, double price, int noOfStrings) {
        super("Guitar", "String Instrument", brand, price);
        this.noOfStrings = noOfStrings;
    }
	  int getNoOfStrings() {
    	return noOfStrings;
	}

	 void setNoOfStrings(int noOfStrings) {
		this.noOfStrings = noOfStrings;
	}

	void display() {
        super.display();
        System.out.println("Number of Strings: " + noOfStrings);
    }
    void playSound() {
        System.out.println("🎸 Guitar is strumming beautiful chords...");
    }

}

// ---------------- Drum Class ----------------
class Drum extends MusInstrument {
    String drumType;
    
     String getDrumType() {
		return drumType;
	}

	 void setDrumType(String drumType) {
		this.drumType = drumType;
	}

	Drum(){
    drumType="Electronic";
    }

    Drum(String brand, double price, String drumType) {
        super("Drum", "Percussion Instrument", brand, price);
        this.drumType = drumType;
    }

    void display() {
        super.display();
        System.out.println("Drum Type: " + drumType);
    }
    void playSound() {
        System.out.println("🥁 Drum is beating rhythmic beats...");
    }

}

// ---------------- Flute Class ----------------
class Flute extends MusInstrument {
    String material;
    
     String getMaterial() {
		return material;
	}

     void setMaterial(String material) {
		this.material = material;
	}

	Flute(){
    	material="Bamboo";
    }

    Flute(String brand, double price, String material) {
        super("Flute", "Wind Instrument", brand, price);
        this.material = material;
    }

    void display() {
        super.display();
        System.out.println("Material: " + material);
    }
    void playSound() {
        System.out.println("🎶 Flute is playing a soft soothing tune...");
    }
}

// ---------------- Test Class ----------------
class TestMusInstruments {
     void main(String[] args) {

        MusInstrument m;

        System.out.println("--- Guitar ---");
        m = new Guitar("Yamaha", 18000, 6);
        m.display();
        m.playSound();

        System.out.println("\n--- Drum ---");
        m = new Drum("Roland", 25000, "Bass Drum");
        m.display();
        m.playSound();

        System.out.println("\n--- Flute ---");
        m = new Flute("Bansuri", 3000, "Bamboo");
        m.display();
        m.playSound();
    }
}