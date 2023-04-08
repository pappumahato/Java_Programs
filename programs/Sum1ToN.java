// method to return sum of first N numbers

import java.util.Scanner;
class Sum1ToN
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scn.nextInt();
		int res = isSumOfN(num);
		System.out.println("Sum of 1 to "+num+" is "+res);
	}

	static int isSumOfN(int n)
	{
		int i=2,sum=1;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		return sum;
	}
}