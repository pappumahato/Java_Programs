import java.util.Scanner;
class PatternA7
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n*5;j=j+5)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}