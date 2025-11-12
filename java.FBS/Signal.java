package inheritanceDemo;

public class Signal {
	String color;
	int duration;
	String location;

	// Default Constructor
	Signal() {
		System.out.println("Signal default constructor");
		color = "Red";
		duration = 30;
		location = "Unknown";
	}

	// Parameterized Constructor
	Signal(String color, int duration, String location) {
		System.out.println("Signal parameterized constructor");
		this.color = color;
		this.duration = duration;
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	void display() {
		System.out.println("Color: " + color);
		System.out.println("Duration: " + duration + " seconds");
		System.out.println("Location: " + location);
	}
}

// Subclass 1: Traffic Signal
class TrafficSignal extends Signal {
	String mode;

	// Default Constructor
	TrafficSignal() {
		super();
		System.out.println("TrafficSignal default constructor");
		mode = "Automatic";
	}

	// Parameterized Constructor
	TrafficSignal(String color, int duration, String location, String mode) {
		super(color, duration, location);
		System.out.println("TrafficSignal parameterized constructor");
		this.mode = mode;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	void display() {
		super.display();
		System.out.println("Mode: " + mode);
	}
}

// Subclass 2: Railway Signal
class RailwaySignal extends Signal {
	String trackStatus;

	// Default Constructor
	RailwaySignal() {
		super();
		System.out.println("RailwaySignal default constructor");
		trackStatus = "Clear";
	}

	// Parameterized Constructor
	RailwaySignal(String color, int duration, String location, String trackStatus) {
		super(color, duration, location);
		System.out.println("RailwaySignal parameterized constructor");
		this.trackStatus = trackStatus;
	}

	public String getTrackStatus() {
		return trackStatus;
	}

	public void setTrackStatus(String trackStatus) {
		this.trackStatus = trackStatus;
	}

	void display() {
		super.display();
		System.out.println("Track Status: " + trackStatus);
	}
}

// Subclass 3: Network Signal
class NetworkSignal extends Signal {
	int strength; // 0–100

	// Default Constructor
	NetworkSignal() {
		super();
		System.out.println("NetworkSignal default constructor");
		strength = 75;
	}

	// Parameterized Constructor
	NetworkSignal(String color, int duration, String location, int strength) {
		super(color, duration, location);
		System.out.println("NetworkSignal parameterized constructor");
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	void display() {
		super.display();
		System.out.println("Signal Strength: " + strength + "%");
	}
}

// 🚨 Subclass 4: Emergency Signal
class EmergencySignal extends Signal {
	String alertType;

	// Default Constructor
	EmergencySignal() {
		super();
		System.out.println("EmergencySignal default constructor");
		alertType = "Fire Alarm";
	}

	// Parameterized Constructor
	EmergencySignal(String color, int duration, String location, String alertType) {
		super(color, duration, location);
		System.out.println("EmergencySignal parameterized constructor");
		this.alertType = alertType;
	}

	public String getAlertType() {
		return alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	void display() {
		super.display();
		System.out.println("Alert Type: " + alertType);
	}
}

// Demo class
class DemoSignal {
	public static void main(String[] args) {
		System.out.println("\n--- USING PARAMETERIZED CONSTRUCTORS ---");
		TrafficSignal t = new TrafficSignal("Green", 45, "Main Road", "Automatic");
		RailwaySignal r = new RailwaySignal("Red", 60, "Station A", "Track Busy");
		NetworkSignal n = new NetworkSignal("Blue", 5, "Mobile Tower", 85);
		EmergencySignal e = new EmergencySignal("Red", 10, "Building 5", "Fire Alert");

		System.out.println("\n--- TRAFFIC SIGNAL ---");
		t.display();
		System.out.println("\n--- RAILWAY SIGNAL ---");
		r.display();
		System.out.println("\n--- NETWORK SIGNAL ---");
		n.display();
		System.out.println("\n--- EMERGENCY SIGNAL ---");
		e.display();

		System.out.println("\n--- USING DEFAULT CONSTRUCTORS ---");
		new TrafficSignal().display();
		new RailwaySignal().display();
		new NetworkSignal().display();
		new EmergencySignal().display();
	}
}
