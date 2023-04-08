import java.util.Scanner;
class SumEven 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = scn.nextInt();
		
		
		SumEven s = new SumEven();
		int num = s.isSumEven(n);
		System.out.println("sum of even number is : "+num);
	}

	int isSumEven(int x)
	{
		int i,sum=0;
		for(i=0;i<=x;i++)
		{
			if(i%2==0){
				sum=sum+i;
			}
		}
		return sum;
	}
}
