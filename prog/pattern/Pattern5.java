import java.util.Scanner;
class Pattern5
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
	}
}