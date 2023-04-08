// WAP to check palindrome or not

import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		int rev=0,t=n;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(t==rev)
			System.out.println(t+" is Palindrome");
		else
			System.out.println(t+" is not palindrome");
	}
}
