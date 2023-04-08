// method to return sum of digits of the passed number

import java.util.Scanner;
class SumDigit
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		int res=isDigitSum(n);
		System.out.println("Sum of digits of "+n+" is "+res);
	}

	static int isDigitSum(int x)
	{
		int sum=0;
		while(x!=0)
		{
			int r=x%10;
			sum=sum+r;
			x=x/10;
		}
		return sum;
	}
}

/*

sum=0;
do{
	int r=x%10;
	sum=sum+r;
	x=x/10;
}while(x!=0)

*/