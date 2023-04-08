package method;

import java.util.Scanner;

public class StudentResult 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter four subject marks");
		int m1=scn.nextInt();
		int m2=scn.nextInt();
		int m3=scn.nextInt();
		int m4=scn.nextInt();
		String res = getResult(m1,m2,m3,m4);
		System.out.println("Result is :"+res);
	}

	private static String getResult(int m1, int m2, int m3, int m4) 
	{
		if(m1<35||m2<35||m3<35||m4<35)
			return "Fail";
		double per=(m1+m2+m3+m4)/4.0;
		if(per>=85)
			return "Distinction";
		if(per>=60)
			return "First Class";
		if(per>=50)
			return "Second Class";
		return "Pass";
	}

}
