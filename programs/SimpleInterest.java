import java.util.Scanner;

class SimpleInterest
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the principle : ");
		int p = scn.nextInt();
		System.out.println("Enter the rate of interest : ");
		float r = scn.nextFloat();
		System.out.println("Enter the time : ");
		float t = scn.nextFloat();
		double si = p*r*t/100;
		System.out.println("Principle is : "+p);
		System.out.println("Rate is : "+r);
		System.out.println("Time is : "+t);
		System.out.println("Simple interest is : "+si);
	}
}