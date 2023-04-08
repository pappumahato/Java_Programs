import java.util.Scanner;
class PosNeg
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		new int n = scn.nextInt();
		if(n>0)
			System.out.println("The number is Positive");
		else
			System.out.println("The number is Negative");
		
	}
}