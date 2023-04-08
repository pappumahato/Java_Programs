/*A sentence containing every letter of the alphabet*/

package strings;

import java.util.Scanner;

public class Panagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println("Given string is: \n"+s);
		String st=removeSpace(s);
		int d=check(st);
		if(d==-1)
			System.out.println(s+"\n"+"is not panagram");
		else
			System.out.println(s+"\n"+"is panagram");
		
	}
	
	
	public static String removeSpace(String s)
	{
		char ch[]=s.toCharArray();
		String nstr="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
				nstr=nstr+ch[i];
		}
		return nstr;
	}
	
	
	public static int check(String st)
	{
		int n=26;
		for (char i = 'A'; i <= 'Z'; i++) 
		{
			if((st.indexOf(i)<0)&&(st.indexOf((char)(i+32))<0))
					return -1;
		}
		return 1;
	}

}
