class BiggestNumber 
{
	public static void main(String[] args) 
	{
		BiggestNumber bn = new BiggestNumber();
		int big = bn.getBiggest(80,45,55);
		System.out.println(big + " is the biggest number");
		int big1 = bn.getBiggest(10,30,5);
		System.out.println(big1 + " is the biggest number");

	}
	int getBiggest(int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		if(b>c)
			return b;
		return c;
	}
}
