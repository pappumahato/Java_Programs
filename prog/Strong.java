/* */

class Strong
{
	boolean isStrong(int x)
	{
		int sum=0,t=x;
		while(x!=0)
		{
			int r = x%10;
			sum=sum+fact(r);
			x=x/10;
		}
		return sum==t;
	}
	int fact(int n)
	{
		int p=1;
		while(n>1)
		{
			p=p*n;
			n--;
		}
		return p;
	}
}
