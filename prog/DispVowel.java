import java.util.Scanner;
class DispVowel
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=scn.next().charAt(0);
		boolean res=isVowel(ch);
		if(res)
			System.out.println(ch+" is vowel ");
		else
			System.out.println(ch+" is not a vowel");
	}

	static boolean isVowel(char c)
	{
		switch(c)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': return true;
			default : return false;
		}
	}
}