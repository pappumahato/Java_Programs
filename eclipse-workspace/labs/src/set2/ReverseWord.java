package set2;

import java.util.Scanner;

public class ReverseWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		s="";
		for (int i = 0; i < s1.length; i++)
		{
			for (int j = s1[i].length()-1; j >=0; j--) 
			{
				s+=s1[i].charAt(j);
			}
			s+=" ";
		}
		s=s.trim();
		System.out.println(s);
	}
}
