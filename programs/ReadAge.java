import java.util.Scanner;

class ReadAge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Before 10 years your age was : "+(age-10));
		System.out.println("After 10 years your age is : "+(age+10));
	}
}
