// method to check the number is strong number or not?
//(sum of factorial of individual digit)


import java.util.Scanner;
class Strong
{
	static boolean isStrong(int n)
	{
		int sum=0,t=n;
		do{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}while(n!=0);
		return sum==t;
	}

	static int fact(int x)
	{
		int f=1;
		while(x!=0)
		{
			f=f*x;
			x--;
		}
		return f;
	}

	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scn.nextInt();
		boolean res= isStrong(num);
		if(res)
			System.out.println(num+" is a strong number");
		else
			System.out.println(num+" is not a strong number");
	}
}