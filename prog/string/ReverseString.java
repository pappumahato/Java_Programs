import java.util.Scanner;
class ReverseString
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
		String res=isReverse(str);
		System.out.println("Reverse string is: "+res);
	}

	public static String isReverse(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			res=ch+res;
		}
		return res;
	}
}