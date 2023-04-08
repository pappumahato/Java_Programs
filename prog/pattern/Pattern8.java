import java.util.Scanner;
class Pattern8
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		for(;n!=0;n=n/10)
		{
			for(int j=1;j<=n%10;j++)
			{
				System.out.print("*"+" ");

			}
			System.out.println();
		}
	}
}