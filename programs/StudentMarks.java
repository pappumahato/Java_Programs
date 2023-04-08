// to read 4 sub marks and display his result, result may be fail,distinction, 1st class, 2nd class, pass

import java.util.Scanner;
class StudentMarks
{
	public static void main(String args[])
	{
		int m1,m2,m3,m4;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st subject marks(0 to 100):");
		m1=scn.nextInt();
		System.out.println("Enter 2nd subject marks(0 to 100):");
		m2=scn.nextInt();
		System.out.println("Enter 3rd subject marks(0 to 100):");
		m3=scn.nextInt();
		System.out.println("Enter 4th subject marks(0 to 100):");
		m4=scn.nextInt();
		double per=((m1+m2+m3+m4)*100)/400;
		if(m1>35&&m2>35&&m3>35&&m4>35)
		{
			if(per>35&&per<50)
				System.out.println("pass");
			else if(per>=50&&per<60)
				System.out.println("second class");
			else if(per>=60&&per<85)
				System.out.println("first class");
			else
				System.out.println("distinction");
		}
		else
			System.out.println("fails");
	}
}