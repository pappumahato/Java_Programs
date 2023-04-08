import java.util.Scanner;
class HexaNumber
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the decimal number :");
		int num = scn.nextInt();
		HexaNumber hn = new HexaNumber();
		String res = hn.decToHex(num);
		System.out.println(res+" is the hexadecimal number of "+num);


	}


	String decToHex(int n)
	{
		String hx="";
		while(n!=0)
		{
			int r=n%16;
			if(r<10)
				hx=r+hx;
			else if(r==10)
				hx='A'+hx;
			else if(r==11)
				hx='B'+hx;
			else if(r==12)
				hx='C'+hx;
			else if(r==13)
				hx='D'+hx;
			else if(r==14)
				hx='E'+hx;
			else if(r==15)
				hx='F'+hx;
			n=n/16;


			/*
				else
					hx=(char)(r+55)+hx;
					n=n/16;
			*/
		}
		return hx;
	}
}