// method overloading

class MainRunner2
{
	static void display(int a, char b)
	{
		System.out.println("int and char method");
	}

	static void display(char a, int b)
	{
		System.out.println("char and int method");
	}

	static void display(int a, int b)
	{
		System.out.println("int and int method");
	}

	public static void main(String arg[])
	{
		System.out.println("main method started");
		display(12,34);
		System.out.println("---------------------------");

		display(12,'s');
		System.out.println("---------------------------");

		display('a',34);
		System.out.println("---------------------------");

		display((short)3,45);
		System.out.println("---------------------------");

		//display('a','d');
		//System.out.println("---------------------------");
	}
}