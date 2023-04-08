// 4 seperate method to perform arithmetic operations

import java.util.Scanner;
class ArithmeticOperation
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1=scn.nextInt();
		System.out.println("Enter second number :");
		int num2=scn.nextInt();

		int res1=isSum(num1,num2);
		System.out.println("Addition is : "+res1);

		int res2=isSub(num1,num2);
		System.out.println("substraction = "+res2);

		int res3=isMul(num1,num2);
		System.out.println("Multiplication = "+res3);

		int res4=isDiv(num1,num2);
		System.out.println("Division = "+res4);
	}

	static int isSum(int a, int b)
	{
		int sum=a+b;
		return sum;
	}

	static int isSub(int a, int b)
	{
		int sub=a-b;
		return sub;
	}

	static int isMul(int a, int b)
	{
		int m=a*b;
		return m;
	}

	static int isDiv(int a, int b)
	{
		int d=a/b;
		return d;
	}
}