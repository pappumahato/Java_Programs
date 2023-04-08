// Method to display the multiplication table

import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scn.nextInt();
		Table t = new Table();
		String[] res = t.mulTable(n);
		for(int j=0;j<10;j++)
		{
			System.out.println(res[j]);	
		}
	}
	String[] mulTable(int x)
	{
		String[] arg1 = new String[10];
		for(int i=1;i<=10;i++)
		{
			arg1[i-1] = x+"*"+i+"="+(x*i);	
		}
		return arg1;
	}
}
 
 