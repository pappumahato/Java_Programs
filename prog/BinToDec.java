/* method to convert bin to decimal */

import java.util.Scanner;
class BinToDec
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a binary number :");
		int num = scn.nextInt();
		BinToDec b = new BinToDec();
		int res = b.isToDecimal(num);
		System.out.println("the converted decimal number of "+num+" is :"+res);
	}

	int isToDecimal(int bin)
	{
		int sum=0,p=0;
		while(bin!=0)
		{
			int r = bin%10;
			sum = sum+r*power(2,p);
			p++;
			bin=bin/10;
		}
		return sum;
	}

	int power(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
}