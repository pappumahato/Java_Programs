import java.util.Scanner;
class Pattern7
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>0;j--)
			{
				System.out.print((char)(j+64)+" ");

			}
			System.out.println();
		}
	}
}