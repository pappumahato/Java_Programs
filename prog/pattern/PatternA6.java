import java.util.Scanner;
class PatternA6
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
				System.out.print(k+" ");
				k++;
				if(k==10)
					k=1;
			}
			System.out.println();
		}
	}
}