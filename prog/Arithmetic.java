import java.util.Scanner;
class Arithmetic
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two number");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		isAdd(n1,n2);
		isSub(n1,n2);
		isMul(n1,n2);
		isDiv(n1,n2);
	}

	static void isAdd(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+sum);
	}

	static void isSub(int a,int b)
	{
		int s=a-b;
		System.out.println("Substraction of "+a+" and "+b+" is "+s);
	}

	static void isMul(int a,int b)
	{
		int mul=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+mul);
	}

	static void isDiv(int a,int b)
	{
		int div=a/b;
		System.out.println("Division of "+a+" and "+b+" is "+div);
	}
}