package inteface;

interface Printer {
	void print();

	void scan();

	void cancel();
}

class LaserPrinter implements Printer {

	public void print() {
		System.out.println("Printing document...");
	}

	public void scan() {
		System.out.println("Scanning document...");
	}

	public void cancel() {
		System.out.println("Print job cancelled");
	}

	public static void main(String[] args) {

		Printer p = new LaserPrinter(); // interface reference
		p.print();
		p.scan();
		p.cancel();
	}
}
