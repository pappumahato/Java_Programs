import java.util.Scanner;
class ArrayA1
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of people ");
		int num=scn.nextInt();
		int wei[]=new int[num];
		for(int i=0;i<wei.length;i++)
			wei[i]=scn.nextInt();
		int sum=0;
		for(int i=0;i<wei.length;i++)
			sum=sum+wei[i];
		if(sum<=890)
		{
			System.out.println("Lift is moving");
		}
		else
		{
			System.out.println("Lift is not moving");
		}
	}
}