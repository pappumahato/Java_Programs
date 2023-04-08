import java.util.Scanner;
class PatternA9
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int k=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(k+65)+" ");
				k++;
			}
			System.out.println();
		}
	}
}