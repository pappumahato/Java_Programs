class LeastNumber
{
	int isLeastNumber(int a,int b,int c)
	{
		if(a<b && a<c)
			return a;
		else if(b<c)
			return b;
		else
			return c;
	}
	public static void main(String[] args) 
	{
		LeastNumber ln = new LeastNumber();
		int least = ln.isLeastNumber(15,12,30);
		System.out.println(least+" is least number");
		int least1 = ln.isLeastNumber(45,62,85);
		System.out.println(least1+" is least number");
		int least2 = ln.isLeastNumber(74,62,59);
		System.out.println(least2+" is least number");
	}
}
