class Pen
{
	String pName;
	String pColor;
	double pPrice;

	void write()
	{
		System.out.println(pColor+" pen is writing");
	}
}


class MainRunner05
{
	public static void main(String[] args) 
	{
		Pen p1 = new Pen();
		p1.pName="cello";
		p1.pColor="Red";
		p1.pPrice=45.6;

		Pen p2 = new Pen();
		p2.pName="parker";
		p2.pColor="Blue";
		p2.pPrice=65.6;

		p2.write();
	}
} 