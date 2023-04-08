import java.util.Scanner;
class PatternA1
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
}