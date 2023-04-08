// method to count even number b/w 1 to N

import java.util.Scanner;
class CountEven
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scn.nextInt();
		int res=isCountEven(num);
		System.out.println("number to even number b/w 1 to "+num+" is "+res);
	}

	static int isCountEven(int n)
	{
		int count=0;
		while(n>0)
		{
			if(n%2==0)
				count++;
			n--;
		}
		return count;
	}
}

/*
int i=2,c=0;
while(i<=n)
{
	if(n%2==0)
	c++
	i++
}
*/