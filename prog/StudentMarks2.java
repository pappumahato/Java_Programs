import java.util.Scanner;
class StudentMarks2
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st sub marks: ");
		int m1 = scn.nextInt();
		System.out.println("Enter 2nd sub marks: ");
		int m2 = scn.nextInt();
		System.out.println("Enter 3rd sub marks: ");
		int m3 = scn.nextInt();
		System.out.println("Enter 4th sub marks: ");
		int m4 = scn.nextInt();
		if(m1>40 && m2>40 && m3>40 && m4>40)
		{
				int per = ((m1+m2+m3+m4)*100)/400;
				if(per<50 && per>40)
					System.out.println("Third Division");
				else if(per<60 && per>50)
					System.out.println("Second Division");
				else
					System.out.println("First Division");
		}
		else
			System.out.println("Student Fails");
	}
}