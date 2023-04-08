// method overloading


class Addition
{
	static int add(int a, int b)
	{
		System.out.println("First value is "+a);
		System.out.println("Second value is "+b);
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		System.out.println("First value is "+a);
		System.out.println("Second value is "+b);
		System.out.println("Third value is "+c);
		return a+b+c;
	}

	static double add(double a, double b)
	{
		System.out.println("First value is "+a);
		System.out.println("Second value is "+b);
		return a+b;
	}

	public static void main(String arg[])
	{
		int x=add(12,34);
		System.out.println("Sum = "+x);
		int y=add(12,34,80);
		System.out.println("Sum = "+y);
		double z=add(40.5,34.6);
		System.out.println("Sum = "+z);
	}

}