package strings;

import java.util.Scanner;

public class NoOfOccurOfEachChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		int n=st.length();
		char ch[]=st.toCharArray();
		for (int i = 0; i < n; i++) 
		{
			int count=1;
			for (int j=i+1; j < n; j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
					int k=j;
					while(k<n-1)
					{
						ch[k]=ch[k+1];
						k++;
					}
					n--;
					j--;
				}
			}
			System.out.println(ch[i]+" occurred "+count+" times");
		}
		String nst="";
		for (int p = 0; p < n; p++)
		{
			nst=nst+ch[p];
		}
		System.out.println(nst);
	}
}
