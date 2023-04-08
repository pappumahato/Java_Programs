// jvm 


class MainRunnerS
{
	int a=120;
	static int b=320;
	void display()
	{
		System.out.println("I am display method");
	}
	static void print()
	{
		System.out.println("I am print method");
	}

	public static void main(String arg[])
	{
		System.out.println("main method started");
		System.out.println(b);
		print();
		MainRunnerS ms = new MainRunnerS();
		System.out.println(ms.a);
		ms.display();
	}
}