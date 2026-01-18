package inteface;

interface Switch {
	void turnOn();

	void turnOff();
}

class Fan implements Switch {

	public void turnOn() {
		System.out.println("Fan is ON");
	}

	public void turnOff() {
		System.out.println("Fan is OFF");
	}

	public static void main(String[] args) {

		Switch s = new Fan(); // interface reference
		s.turnOn();
		s.turnOff();
	}
}
