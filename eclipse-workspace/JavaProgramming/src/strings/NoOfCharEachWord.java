package strings;

import java.util.Scanner;

public class NoOfCharEachWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String nstr="";
		int nc=0;
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				nstr=nstr+" "+nc+" ";
				nc=0;
			}
			else
			{
				nc++;
				nstr=nstr+str.charAt(i);
			}
		}
		nstr=nstr+" "+nc;
		System.out.println("no of character in each word in a string is "+nstr);
	}
}
