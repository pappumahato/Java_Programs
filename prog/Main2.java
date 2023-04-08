import java.util.Scanner;
class Main2
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = scn.nextInt();
		if(n/2*2==n)
			System.out.println(n + "no is even");
		else
			System.out.println(n + "no is odd");
	}
}