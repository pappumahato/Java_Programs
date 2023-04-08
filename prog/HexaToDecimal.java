import java.util.Scanner;
public class HexaToDecimal
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the hexadecimal number");
		String hex=scn.next();
		HexaToDecimal hn=new HexaToDecimal();
		int dec=hn.hexToDecimal(hex);
		System.out.println(dec);
		
	}

	int hexToDecimal(String hx)
	{
		int dec=0,i=0;
		for(int in=hx.length()-1;in>=0;in--,i++)
		{
			char ch=hx.charAt(in);
			if(ch>='A'&&ch<='Z')
				dec=dec+(ch-55)*pow(16,i);
			else if(ch>='a'&&ch<='z')
				dec=dec+(ch-87)*pow(16,i);
			else
				dec=dec+(ch-48)*pow(16,i);
		}
		return dec;
	}

	int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

}
