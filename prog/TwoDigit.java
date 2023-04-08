class TwoDigit 
{
	boolean isTwoDigit(int x)
	{
		if((x>9 && x<100) || (x<-9 && x>-100))
			return true;
		else
			return false;
	}
	void display(boolean n, int num)
	{
		if(n==true)
			System.out.println(num +" is two digit");	
		else
			System.out.println(num +" is not two digit");
	}
	public static void main(String[] args) 
	{
		TwoDigit t = new TwoDigit();
		int num1 = 100;
		boolean n = t.isTwoDigit(num1);
		t.display(n,num1);
		int num2 = 12;
		boolean y = t.isTwoDigit(num2);
		t.display(y,num2);
		int num3 = 10;
		boolean z = t.isTwoDigit(num3);
		t.display(z,num3);
	}
}
