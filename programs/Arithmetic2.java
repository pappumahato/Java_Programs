class Arithmetic2
{
	public static void main(String[] args) 
	{
		perform(2,4);
		perform(3,6);
		perform(36,24);
	}

	static void perform(int a, int b)
	{
		System.out.println("Addition :"+(a+b));
		System.out.println("Substraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division :"+(a/b));
	}
}