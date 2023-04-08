import java.util.Scanner;
class StudentMarks
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
		int sum = m1+m2+m3+m4;
		int per = sum/400*100;
		if(per>60)
			System.out.println("First division");
		else if(per<60 || per>33)
			System.out.println("Second division");
		else
			System.out.println("Fail");
	}
}