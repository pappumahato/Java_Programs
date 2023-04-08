/* method to check palindrome or not */

import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome :");
		int num = scn.nextInt();
		Palindrome p = new Palindrome();
		boolean res = p.isPalindrome(num);
		if(res==true)
			System.out.println(num+" is a Palindrome number");
		else
			System.out.println(num+" is not a palindrome number");
	}

	boolean isPalindrome(int n)
	{
		int temp=n,sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum = (sum*10)+rem;
			n=n/10;
		}
		return sum==temp;
	}
}