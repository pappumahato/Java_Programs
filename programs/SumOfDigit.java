// WAP to calculate the sum of digit in the number

import java.util.Scanner;
class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digit = "+sum);
	}
}
