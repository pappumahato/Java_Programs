import java.util.Scanner;

class Marks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m1,m2,m3,m4,total;
		double avg;
		
		System.out.println("Enter first subject marks : ");
		m1 = sc.nextInt();

		System.out.println("Enter second subject marks : ");
		m2 = sc.nextInt();

		System.out.println("Enter third subject marks : ");
		m3 = sc.nextInt();

		System.out.println("Enter fourth subject marks : ");
		m4 = sc.nextInt();

		total = m1+m2+m3+m4;
		avg = total/4;

		System.out.println("first subject marks : "+m1);
		System.out.println("second subject marks : "+m2);
		System.out.println("third subject marks : "+m3);
		System.out.println("fourth subject marks : "+m4);

		System.out.println("Total marks = "+total);
		System.out.println("Average marks = "+avg);

	}
}