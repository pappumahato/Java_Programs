package set2;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		String s1=scn.next();
		if(s.length()!=s1.length())
		{
			System.out.println("Not an anagram");
		}
		else
		{
			int arr[]=new int[26];
			int arr2[]=new int[26];
			for (int i = 0; i < s.length(); i++) 
			{
				arr[s.charAt(i)-97]++;
				arr2[s1.charAt(i)-97]++;
			}
			boolean flag=true;
			for (int i = 0; i < 26; i++)
			{
				if(arr[i]!=arr2[i])
				{
					System.out.println("Not an anagram");
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("it's an anagram");
			}
		}
	}
}
