
import java.util.Scanner;
class Bmi
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Your height in m :");
		double h = scn.nextDouble();
		System.out.println("Your weight in kg :");
		double w = scn.nextDouble();


		double bmi = w/(h*h);
		String msg="";

		if(bmi<18.5) 
		{
			msg="under weight";
		}
		if(bmi>=18.5&&bmi<=24.9) 
		{
			msg="normal weight";
		}
		if(bmi>=25.0&&bmi<=29.9)
		{ 
			msg="over weight";
		}
		if(bmi>=30) 
		{
			msg="obese";
		}

		System.out.println("Your Bmi is :"+bmi);
		System.out.println("BMI category : "+msg);

	}
}