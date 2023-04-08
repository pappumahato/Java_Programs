class Bike
{
	String color="Blue";
	double price=30000;
	static int noOfWheels=2;
	boolean isWorking=true;
	Petrol p;
	void fillPetrol(Petrol p)
	{
		this.p=p;
		System.out.println("Bike filled with petrol");
	}

	void start()
	{
		if(p==null)
		System.out.println("fill the petrol");
		else
		System.out.println("Bike Starts");
	}
}

class Petrol
{
	
}

public class TestBike
{
	public static void main(String arg[])
	{
		Bike b=new Bike();
		b.start();
		Petrol p = new Petrol();
		b.fillPetrol(p);
		b.start();
	}
}