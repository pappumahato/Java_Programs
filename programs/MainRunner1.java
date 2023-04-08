// method overloading

class MainRunner1
{
	public static void main(String arg[])
	{
		System.out.println("Main method started");
		double d1=sum(10,20.9);
		System.out.println(d1);

		double d2=sum(10.56,29);
		System.out.println(d2);

		/*
		double d3=sum(10.56,20.9);
		System.out.println(d3);// no suitable method found for sum(double,double)
		*/

		/*
		double d4=sum(10,20);
		System.out.println(d4);// ambigues error
		*/

		System.out.println("Main method ends");
	}

	static double sum(int a, double b)
	{
		System.out.println("int and double type method");
		return a+b;
	}

	static double sum(double a, int b)
	{
		System.out.println("double and int type method");
		return a+b;
	}
}