// method to check the no. is special two digit number or not.

import java.util.Scanner;
class SpecialTwoDigit
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two digit number :");
		int num = scn.nextInt();
		boolean res=isSpecial(num);
		if(res)
			System.out.println(num+" is a special number");
		else
			System.out.println(num+" is not a special number");
	}

	static boolean isSpecial(int n)
	{
		int r=n%10;
		int d=n/10;
		int sum=(r+d)+(r*d);
		return sum==n;
	}
}