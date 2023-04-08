import java.util.Scanner;
class ClockAngle 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Hour And Minute :");
		int hr=scn.nextInt();
		int min=scn.nextInt();
		double lAngle=0.0;
		double hAngle=hr*30+min*.5;
		double mAngle=min*6;

		if(hAngle>mAngle)
			lAngle=hAngle-mAngle;
		else
			lAngle=mAngle-hAngle;
		if(lAngle>180)
			lAngle=360-lAngle;
		System.out.println("The List Angle is : "+lAngle);

	}
}
