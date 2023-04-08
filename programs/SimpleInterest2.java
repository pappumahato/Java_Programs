// method to calculate and return S.I

import java.util.Scanner;
class SimpleInterest2
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the principle amount :");
		float p=scn.nextFloat();
		System.out.println("Enter Rate of interest :");
		float r=scn.nextFloat();
		System.out.println("Enter time :");
		float t=scn.nextFloat();

		double res = isSimpleInterest(p,r,t);
		System.out.println("Simple interest = "+res);
	}

	static double isSimpleInterest(float x, float y, float z)
	{
		double si=x*y*z/100;
		return si;
	}
}