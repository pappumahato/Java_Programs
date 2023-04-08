/*  To display n0 of even and odd digits present in number*/

import java.util.Scanner;
class EvenDigit
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scn.nextInt();
		int d1,ec=0,oc=0,n=num;
		while(num!=0)
		{
			d1 = num%10;
			if(d1%2==0)
				ec++;
			else
				oc++;
			num = num/10;
		}
		System.out.println(ec+" number of even digit present in "+n);
		System.out.println(oc+" number of odd digit present in "+n);
	}
}
