// WAP to reverse the number

import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse number is : "+rev);
	}
}
