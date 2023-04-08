import java.util.Scanner;
class Si
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Principal");
		int p = scn.nextInt();
		System.out.println("Enter Rate of interest");
		double r = scn.nextDouble();
		System.out.println("Enter Time");
		int t = scn.nextInt();
		double si = (p*r*t)/100;
		System.out.println("The simple interest is : " + si);
	}
}