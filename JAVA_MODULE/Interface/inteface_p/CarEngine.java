package inteface;

interface Engine {
	void start();

	void stop();
}

class CarEngine implements Engine {

	public void start() {
		System.out.println("Car engine started");
	}

	public void stop() {
		System.out.println("Car engine stopped");
	}

	public static void main(String[] args) {
		Engine e = new CarEngine();
		e.start();
		e.stop();
	}
}
