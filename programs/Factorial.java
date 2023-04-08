// method to return factorial of Number

import java.util.Scanner;
class Factorial
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scn.nextInt();
		int res=isFactorial(num);
		System.out.println("Factorial of "+num+" is "+res);
	}

	static int isFactorial(int n)
	{
		int i=2,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		return fact;
	}
}