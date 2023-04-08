class Test
{
	public static void main(String[] args) 
	{
		int a[]={23,45,56,78,89};
		int b[]={11,22,33};
		int j=0,in=2;
		int na[]=new int[a.length+b.length];
		for(int i=0;i<na.length;i++)
		{
			if(i<in)
				na[i]=a[i];
			else if(j<b.length+i)
				na[i]=b[j++];
			else
				na[i]=a[i-b.length];
		}
		for(int k=0;k<na.length;k++)
			System.out.print(k+" ");
	}
}