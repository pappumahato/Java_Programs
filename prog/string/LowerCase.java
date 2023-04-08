import java.util.Scanner;
class LowerCase
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scn.nextLine();
		String res=toLowerCase(str);
		System.out.println("converted lower case :"+res);
	}

	public static String toLowerCase(String str)
	{
		String st="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				ch=(char)(ch+32);
			st=st+ch;
		}
		return st;
	}
}