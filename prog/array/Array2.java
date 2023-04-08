
class Array2
{
	public static void main(String[] args)
	{
		//int ar[]={23,54,67,43};
		int ar[];
		ar=new int[]{34,56,78,98};
		System.out.println("First element "+ar[0]);
		System.out.println("Last element "+ar[ar.length-1]);
		System.out.println("Size "+ar.length);
		for(int i=0;i<ar.length;i++)
			System.out.println(i+"-->"+ar[i]);
		System.out.println("=================");
		for(int i=ar.length-1;i>=0;i--)
			System.out.println(i+"--->"+ar[i]);
	}
}