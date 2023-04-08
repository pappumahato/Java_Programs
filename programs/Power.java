// method to calculate power

import java.util.Scanner;
class Power
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=scn.nextInt();
		System.out.println("Enter the power value :");
		int p=scn.nextInt();
		int res=isPower(n,p);
		System.out.println(n+" to the power of "+p+" is "+res);
	}

	static int isPower(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
}