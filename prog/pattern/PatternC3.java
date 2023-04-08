import java.util.Scanner;
class PatternC3
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				if(j<i)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}