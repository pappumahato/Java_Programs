import java.util.Scanner;
class BinNumber
{
	public static void main(String[] args)
	{
		BinNumber bn = newBinNumber();
		String b=bn.decToBin(78);
	}

	String decToBin(int n)
	{
		String bin="";
		while(n!=0)
		{
			int r = n%2;
			bin=r+bin;
			n=n/2;
		}
		return bin;
	}
}