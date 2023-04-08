class Simple
{
	int x;
	static int y;
	void display()
	{
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
	}

	static void print()
	{
		Simple si=new Simple();
		System.out.println("x value is "+si.x);
		System.out.println("y value is "+y);
	}
}


class MainSimple
{
	void demo()
	{
		System.out.println("Simple.y");
		Simple si = new Simple();
		System.out.println(si.x);
		si.display();
		Simple.print();
	}

	public static void main(String[] args) 
	{
		System.out.println(Simple.y);
		Simple.print();
		Simple s=new Simple();
		System.out.println(s.x);
		s.display();
		MainSimple ms=new MainSimple();
		ms.demo();
	}
}