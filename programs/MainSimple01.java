class Simple
{
	int a;
	static int b;
	void m1()
	{
		int x=20;
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		System.out.println("X value is "+x);
	}
}


class MainSimple01
{
	public static void main(String arg[])
	{
		Simple si=new Simple();
		System.out.println(si.a);
		System.out.println(Simple.b);
		si.a=200;
		si.m1();
	}
}