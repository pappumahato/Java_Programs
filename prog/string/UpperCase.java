import java.util.Scanner;
class UpperCase
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=scn.nextLine();
		String res=toCapital(str);
		System.out.println(res);

	}

	public static String toCapital(String str)
	{
		String st="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				ch=(char)(ch-32);
			}
			st=st+ch;
		}
		return st;
	}
}