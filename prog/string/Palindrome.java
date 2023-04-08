import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=scn.next();
		int i=0,j=str.length()-1;
		str=str.toLowerCase();
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				System.out.println(str+" is not palindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println(str+" is palindrome");
	}
}