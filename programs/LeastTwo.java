// Least among two number
import java.util.Scanner;
class LeastTwo
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = scn.nextInt();
		System.out.println("Enter second number : ");
		int n2 = scn.nextInt();
		if(n1<n2)
			System.out.println(n1+" is least number");
		else
			System.out.println(n2+" is least number");
	}
}