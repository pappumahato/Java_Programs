// Special two digit number
import java.util.Scanner;
class SpecialNumber
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two digit number : ");
		int n = scn.nextInt();
		if(n>9&&n<100)
		{
			int d1 = n%10;
			int d2 = n/10;
			int sum = (d1*d2)+(d1+d2);
			if(n==sum)
				System.out.println(n+" is Special number");
			else
				System.out.println(n+" is not Special number");
		}
		else
			System.out.println("Please enter two digit number");
	}
} 