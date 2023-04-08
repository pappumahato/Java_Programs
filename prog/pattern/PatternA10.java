import java.util.Scanner;
class PatternA10
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j%2==1)
				{
					System.out.print(k+" ");
					k++;
				}
				else
					System.out.print("*"+" ");
			}
			k=1;
			System.out.println();
		}
	}
}