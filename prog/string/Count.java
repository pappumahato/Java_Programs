import java.util.Scanner;
class Count
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=scn.nextLine();
		int vc=0,cc=0,uc=0,lc=0,dc=0,sc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vc++;
				else
					cc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
			else if(ch>='0'&&ch<='9')
				dc++;
			else
				sc++;
		}
		System.out.println("Number of vowels :"+vc);
		System.out.println("Number of consonents :"+cc);
		System.out.println("Number of uppercase :"+uc);
		System.out.println("Number of lowercase :"+lc);
		System.out.println("Number of digit :"+dc);
		System.out.println("Number of special character :"+sc);
	}
}