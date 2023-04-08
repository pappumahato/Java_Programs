import java.util.Scanner;
class Strong2
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();

		boolean res=isStrong(num);
		if(res)
			System.out.println(num+" is a Strong number");
		else
			System.out.println(num+" is not a Strong number");		
	}

	static boolean isStrong(int n)
	{
		int sum=0, temp=n;
		do{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}

	static int fact(int a)
	{
		int f=1;
		while(a>0)
		{
			f=f*a;
			a--;
		}
		return f;
	}
}