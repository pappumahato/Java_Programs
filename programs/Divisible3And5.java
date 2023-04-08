// print no. b/w 1 to 100 which are divisible by 3 & 5

import java.util.Scanner;
class Divisible3And5
{
	public static void main(String arg[])
	{
		for(int i=15;i<=100;i++)
		{
			if(i%3==0&&i%5==0)
				System.out.println(i);
		}
	}
}