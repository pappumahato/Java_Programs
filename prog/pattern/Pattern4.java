import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}