import java.util.Scanner;
class PatternA11
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(k+" ");
				}
			}
			else
			{
				k++;
				for(int p=0;p<n;p++)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}