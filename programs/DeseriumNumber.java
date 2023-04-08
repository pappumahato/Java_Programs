// method to check deserium number

import java.util.Scanner;
class DeseriumNumber
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scn.nextInt();
		boolean res=isDeserium(num);
		if(res)
			System.out.println(num+" is a deserium number");
		else
			System.out.println(num+" is not a deserium number");
	}

	static boolean isDeserium(int n)
	{
		int c=countDigit(n);
		int sum=0,t=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+power(r,c);
			n=n/10;
			c--;
		}
		return sum==t;
	}

	static int countDigit(int a)
	{
		int count=0;
		while(a!=0)
		{
			count++;
			a=a/10;
		}
		return count;
	}

	static int power(int x, int y)
	{
		int pw=1;
		while(y!=0)
		{
			pw=pw*x;
			y--;
		}
		return pw;
	}
}