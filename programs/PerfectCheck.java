// method to check your number is perfect or not

import java.util.Scanner;
class PerfectCheck
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		boolean res = isPerfect(num);
		if(res)
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
	}

	static boolean isPerfect(int n)
	{
		int sum=0,i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum=sum+i;
			i++;
		}
		return sum==n;
	}
}