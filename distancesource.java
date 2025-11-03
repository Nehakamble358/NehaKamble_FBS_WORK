class Distance
{
	double kilometer;
	double meter;

	void setKilometer(double k){
		this.kilometer=k;
	}
	void setMeter(double m){
		this.meter=m;
	}
}
class TestDistance
{
	public static void main(String[] args)
	{
		Distance d1;
		d1=new Distance();
		d1.setKilometer(1.0);
		d1.setMeter(5500.0);
		System.out.println("Distance Kilometer:"+ d1.kilometer);
		System.out.println("Distance Meter:"+ d1.meter);
		
	}
}

o/p:-Distance Kilometer:1.0
Distance Meter:5500.0
