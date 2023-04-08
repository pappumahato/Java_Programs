// method to return number of digit in the passed number

import java.util.Scanner;
class DigitCount
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scn.nextInt();
		int res=isCountDigit(num);
		System.out.println("Number of digit in "+num+" is "+res);
	}

	static int isCountDigit(int n)
	{
		int count=0;
		do{
			int r=n%10;
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
}