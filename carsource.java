class Car
{
	String model;
	String brand;
	double price;
	String color;
	int fuelCapacity;

	void setModel(String str){
		this.model=str;
	}
	void setBrand(String b){
		this.brand=b;
	}
	void setPrice(double p){
		this.price=p;
	}
	void setColor(String c){
		this.color=c;
	}
	void setFuelCapacity(int f){
		this.fuelCapacity=f;
	}
}
class TestCar
{
	public static void main(String[]args){
	Car c1;
	c1= new Car();
	c1.setModel("Swify VXI");
	c1.setBrand("Maruti");
	c1.setPrice(7500000);
	c1.setColor("Black");
	c1.setFuelCapacity(45);

 	System.out.println("Car Model:"+ c1.model);
	System.out.println("Car Brand:"+ c1.brand);
	System.out.println("Car Price:"+ c1.price);
	System.out.println("Car:Color"+ c1.color);
	System.out.println("Car:FuelCapacity"+ c1.fuelCapacity);
	}
}

o/p:-Car Model:Swify VXI
Car Brand:Maruti
Car Price:7500000.0
Car:ColorBlack
Car:FuelCapacity45




	