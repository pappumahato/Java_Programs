class Natural 
{
	int sum(int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
			sum=sum+i;
		return sum;
	}
	public static void main(String[] args) 
	{
		int n1=5,n2=7,n3=4;
		Natural n = new Natural();
		int x = n.sum(n1);
		System.out.println(x + " is the sum of " + n1 + " numbers");
		
	}
}
