package set1;

import java.util.Scanner;

public class StringTemplate
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s="Hello<<username>>,How are you";
		String username=scn.next();
		String temp="";
		temp=s.substring(0, 5);
		temp+=username;
		temp+=s.substring(17, s.length());
		System.out.println(temp);
		
	}

}
