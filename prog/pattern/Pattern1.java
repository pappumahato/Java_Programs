import java.util.Scanner;
class Pattern1
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scn.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}