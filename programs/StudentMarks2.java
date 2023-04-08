// method to return result of a student by cosidering his 4 sub marks

import java.util.Scanner;
class StudentMarks2
{
	public static void main(String arg[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 4 subject marks (out of 100)");
		int m1=scn.nextInt();
		int m2=scn.nextInt();
		int m3=scn.nextInt();
		int m4=scn.nextInt();

		String res=isStudentMarks(m1,m2,m3,m4);
		System.out.println(res);
	}

	static String isStudentMarks(int n1, int n2, int n3, int n4)
	{
		double per=((n1+n2+n3+n4)*100)/400;
		if(n1>35&&n2>35&&n3>35&&n4>35)
		{
			if(per>35&&per<50)
				return "pass";
			else if(per>=50&&per<60)
				return "Second Class";
			else if(per>=60&&per<85)
				return "First Class";
			else
				return "distinction";
		}
		else
			return "Fails";
	}
}