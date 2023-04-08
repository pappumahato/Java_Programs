import java.util.Scanner;
class PatternA2
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
				System.out.print((char)(j+97)+" ");
			}
			System.out.println();
		}
	}
}