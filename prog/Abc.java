import java.util.Scanner;
class Abc
{
	public static void main(String arg[])
	{
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Enter Age");
	int age = scn.nextInt();
	scn.nextLine();
	
	System.out.println("Enter Name");
	String name = scn.nextLine();
	
	System.out.println("Enter Number");
	int number = scn.nextInt();
	
	System.out.println("age = "+ age);
	System.out.println("name = "+ name);
	System.out.println("number = "+ number);
	}
}