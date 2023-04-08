import java.util.Scanner;
class PatternA5
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String st=scn.nextLine();
		int l=st.length();
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}