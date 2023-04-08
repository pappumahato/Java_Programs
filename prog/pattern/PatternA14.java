import java.util.Scanner;
class PatternA14
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		String str=""+n;
		for(int i=0;i<str.length();i++)
		{
			int x=str.charAt(i)-48;
			for(int j=0;j<x;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}