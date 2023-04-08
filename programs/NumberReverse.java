// method to reverse the number

import java.util.Scanner;
class NumberReverse
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scn.nextInt();
		int res=isReverse(num);
		System.out.println("reverse of "+num+" is "+res);
	}

	static int isReverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
}