import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=scn.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=sum+ch-48;
		}
		System.out.println("Sum of digits "+sum);
	}
}