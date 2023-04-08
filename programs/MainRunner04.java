// user define data type

class Book
{
	int bId;
	String bName;
	String bAuthor;
	double price;

	void bookInfo()
	{
		System.out.println("Book Id = "+bId);
		System.out.println("Book Name = "+bName);
		System.out.println("Author Name = "+bAuthor);
		System.out.println("Price = "+price);
	}
}


class MainRunner04
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
	b1.bId=123;
	b1.bName="Math";
	b1.bAuthor="Rama";
	b1.price=45.5;

	Book b2=new Book();
	b2.bId=125;
	b2.bName="Eng";
	b2.bAuthor="Shyam";
	b2.price=83.54;


	Book b3=new Book();
	b3.bId=127;
	b3.bName="Phy";
	b3.bAuthor="Raju";
	b3.price=64.5;

	b1.bookInfo();
	System.out.println("------------------------------");
	b2.bookInfo();
	System.out.println("------------------------------");
	b3.bookInfo();
	}
}