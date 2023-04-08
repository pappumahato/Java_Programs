/* Method to check Armstrong number*/

import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scn.nextInt();
		Armstrong a = new Armstrong();
		boolean b = a.isArmstrong(num);
		if(b==true)
			System.out.println(num+" is an Armstrong number");
		else
			System.out.println(num+" is not an Armstrong number");
	}


	int countDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}


	int power(int x, int y)
	{
		int pow=1;
		while(y!=0)
		{
			pow=pow*x;
			y--;
		}
		return pow;
	}
	boolean isArmstrong(int a)
	{
		int c = countDigit(a);
		int temp=a;
		int sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			sum=sum+power(rem, c);
			temp=temp/10;
		}
		if(sum==a)
			return true;
		else
			return false;
		//return sum==a;
	}
}