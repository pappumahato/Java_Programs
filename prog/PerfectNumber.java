/* Method to check number is perfect or not*/

import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		PerfectNumber pf = new PerfectNumber();
		boolean rs =pf.isPerfect(n);
		if(rs==true)
			System.out.println(n+" is perfect number");
		else
			System.out.println(n+" is not perfect");

	}
	boolean isPerfect(int x)
	{
		int sum=0;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			}
		}
		if(x==sum)
			return true;
		else
			return false;
	}
}
