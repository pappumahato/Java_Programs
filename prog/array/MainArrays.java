public class MainArrays
{
	public static void main(String[] args) 
	{
		Arrays as=new Arrays();
		System.out.println("Read first array");
		int a[]=as.readArr();
		System.out.println("Read second array");
		int b[]=as.readArr();

		System.out.println("Entered first array");
		as.dispArr(a);
		System.out.println("Entered second array");
		as.dispArr(b);
		System.out.println("========================");

		int c[]=as.mergeArr(a,b);
		System.out.println("After merge");
		as.dispArr(c);
		System.out.println("========================");

		int big=as.biggestArr(a);
		System.out.println("biggest element is "+big);
		System.out.println("========================");
		int res[]=as.countEO(a);
		System.out.println(res[0]+" Even element and "+res[1]+" Odd element");
		System.out.println("========================");

		int res2[]=as.zigZag(a,b);
		System.out.println("zigzag ");
		as.dispArr(res2);


	}
}