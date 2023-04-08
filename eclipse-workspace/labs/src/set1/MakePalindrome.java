package set1;

import java.util.Scanner;

public class MakePalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[26];
		boolean flag=true;
		int count=0;
		String s=sc.next();
		for (int i = 0; i < s.length(); i++) 
		{
			arr[(int)s.charAt(i)-97]++;
			
		}
		
		if(s.length()%2==0)
		{
			for (int i = 0; i < 26; i++) 
			{
				if(arr[i]%2!=0)
				{
					System.out.println("palindrome not possible");
					flag=!flag;
					break;
				}
				
			}
		}
		
		else if(s.length()%2!=0)
		{
			for (int i = 0; i < 26; i++) 
			{
				if(arr[i]%2!=0)
				{
					count++;
					if(count>1)
					{
						System.out.println("palindrome not possible");
						flag=!flag;
						break;
					}
				}
				
			}
		}
		if(flag)
		{
			System.out.println("palindrome possible");
		}
		
	}

}
