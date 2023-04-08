import java.util.Scanner;
class DecimalToAny
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the decimal number :");
		int dec = scn.nextInt();
		System.out.println("Enter the base number :");
		int bas = scn.nextInt();
		DecimalToAny dt = new DecimalToAny();
		String res = dt.toAnyBase(dec,bas);
		System.out.println(res+" is the Converted number of : "+dec);
	}

	String toAnyBase(int n, int b)
	{
		String con="";
		while(n!=0)
		{
			int r=n%b;
			if(r<10)
			{
				con=r+con; 
				n=n/b;
			}
			else
			{
				con=(char)(r+55)+con;
				n=n/b;
			}
		}
		return con;
	}
}