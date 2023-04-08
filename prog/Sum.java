/* W A P to define a method to calculate the sum of n number*/

class	Sum
{
	int sumOfNumber(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
			sum=sum+i;
		return sum;
	}
	public static void main(String[] args) 
	{
		Sum s = new Sum();
		int n1=10;
		int res = s.sumOfNumber(n1);
		System.out.println("Sum of "+n1+" number is :"+res);

		int n2=100;
		int res1 = s.sumOfNumber(n2);
		System.out.println("Sum of "+n2+" number is :"+res1);
	}
}
