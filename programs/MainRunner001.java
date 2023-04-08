class MainRunner001
{
	static int a=20;
	int b=45;
	void m1()
	{
		System.out.println("I am m1 method");
	}
	static void m2()
	{
		System.out.println("I am m2 method");
	}

	public static void main(String arg[])
	{
		System.out.println(a);
		m2();
		MainRunner001 mn=new MainRunner001();
		System.out.println(mn.b);
		mn.m1();
	}
}
