class MainRunnerS1
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Demo.v2=56;
		Demo d1=new Demo();
		Demo d2=new Demo();
		d1.v1=450;
		d1.display();
		System.out.println("=========================");
		d2.display();
		System.out.println("=========================");
		d1.v2=10000;
		d2.v1=900;
		d1.display();
		System.out.println("=========================");
		d2.display();
	}
}


class Demo
{
	int v1;
	static int v2;

	void display()
	{
		System.out.println("v1 value is "+v1);
		System.out.println("v2 value is "+v2);
	}
}