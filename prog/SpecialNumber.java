class SpecialNumber 
{
	boolean isSpecialTwoDigit(int n)
	{
		int d1 = n/10;
		int d2 = n%10;
		int sum = (d1*d2)+(d1+d2);
		if(n==sum)
			return true;
		else
			return false;
	}

	void display(boolean a,int num)
	{
		if(a==true)
			System.out.println(num+" is Special Two Digit Number");
		else
			System.out.println(num+" is Not Special Two Digit Number");
	}


	public static void main(String[] args) 
	{
		SpecialNumber s = new SpecialNumber();
		int num1=59;
		boolean n = s.isSpecialTwoDigit(num1);
		s.display(n,num1);
		int num2 = 89;
		boolean n2=s.isSpecialTwoDigit(num2);
		s.display(n2,num2);
		int num3=65;
		boolean n3=s.isSpecialTwoDigit(num3);
		s.display(n3,num3);

	}
}
