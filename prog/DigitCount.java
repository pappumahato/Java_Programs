/* method to count the digit of a number */

import java.util.Scanner;
class DigitCount 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		DigitCount dc = new DigitCount();
		int res = dc.isCount(num);
		System.out.println("No of digit in "+num+" is "+res);

	}
	int isCount(int n)
	{
		int c=0;
		do{
			c++;
			n=n/10;
		}while(n!=0);
		return c;
		/*while(n>0)
		{
		int count=0;
		int d1=n%10;
		count++;
		n=n/10;
		}
		return count;*/
	}
}
