class MainDemo
{
	static int a=30;
	int b=900;
	public static void main(String arg[])
	{
		int a=90;
		int b=9;
		System.out.println("Main method started");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		System.out.println("A value is "+MainDemo.a);
		MainDemo md=new MainDemo();
		System.out.println("B value is "+md.b);
		Demo d1=new Demo();
		d1.display();
	}
}

class Demo
{
	int x=100;
	static int y=200;
	int z=300;
	void display()
	{
		int x=10;
		int y=20;
		int w=45;
		System.out.println("X value is "+x);
		System.out.println("Y value is "+y);
		System.out.println("Z value is "+z);
		System.out.println("W value is "+w);
		System.out.println("X value is "+this.x);
		System.out.println("Y value is "+Demo.y);
	}
}