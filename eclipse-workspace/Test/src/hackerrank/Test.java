package hackerrank;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=toLowerCase(str);
		System.out.println(str);
		
	}
	
	static String toLowerCase(String str)
	{
		char ch[]=str.toCharArray();
		String nstr="";
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
				nstr=nstr+((char)(ch[i]+32));
			else
				nstr=nstr+ch[i];
		}
		return nstr;
	}

   
}

