
class Array3
{
	public static void main(String[] args) 
	{
		int ar[];//declaration
		ar=new int[5];//allocation
		//int x[]=new int[5];//declaration
		//int y[]={98,45,65,43,32};declaration,allocation
		ar[0]=98;
		ar[1]=45;
		ar[2]=76;
		ar[3]=36;
		ar[4]=32;//initialization
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
	}
}