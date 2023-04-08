import java.util.Scanner;
class Power
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Enter the power");
		int pow=sc.nextInt();

		int res=isPower(num,pow);
		System.out.println(num+" to the power "+pow +" is " +res);
	}
	static int isPower(int n,int p)
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