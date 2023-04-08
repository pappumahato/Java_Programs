import java.util.Scanner;
class Name
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.nextLine();
		System.out.println("Hi "+name+" What's your age :");
		int age = s.nextInt();
		System.out.println(name+" still your age is "+age);
	}
}