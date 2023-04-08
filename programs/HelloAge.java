import java.util.Scanner;
class HelloAge
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id :");
		int id = sc.nextInt();
		System.out.println("Enter your Name :");
		  sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}