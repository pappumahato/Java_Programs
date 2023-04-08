class Air
{
	
}

class Water
{
	
}

class Nitrogen
{
	
}

class Balloon
{
	void fill(Air a)
	{
		System.out.println("Filled with Air");
	}

	void fill(Water w)
	{
		System.out.println("Filled with Water");
	}

	void fill(Nitrogen n)
	{
		System.out.println("Filled with Nitrogen");
	}
}


class MainBalloon
{
	public static void main(String arg[])
	{
		Balloon b1=new Balloon();
		Air a=new Air();
		b1.fill(a);

		Balloon b2=new Balloon();
		Water w=new Water();
		b2.fill(w);

		Balloon b3=new Balloon();
		Nitrogen n=new Nitrogen();
		b3.fill(n);
	}
}