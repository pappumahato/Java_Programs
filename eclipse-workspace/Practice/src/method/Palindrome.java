package method;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		boolean rs=isPalindrome(n);
		if(rs)
			System.out.println(n+" is palindrome");
		else
			System.out.println(n+" is not palindrome");
		
	}

	private static boolean isPalindrome(int n) 
	{
		int rev=0,t=n;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev==t;
	}

}
