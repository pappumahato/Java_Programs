// method overloading

class MainRunner3
{
	static int sum(int a, int b)
	{
		System.out.println("2 arguments method");
		return a+b;
	}

	static int sum(int a, int b, int c)
	{
		System.out.println("3 arguments method");
		return sum(a,b)+c;
	}

	static int sum(int a, int b, int c, int d)
	{
		System.out.println("4 arguments method");
		return a+sum(b,c,d);
		//return sum(a,b)+sum(c,d);
	}

	public static void main(String arg[])
	{
		sum(23,45);
		sum(23,45,89,90);
		sum(2,3,4,sum(5,6));
	}
}