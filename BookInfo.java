
class BookInfo 
{
	int price;
	public BookInfo(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	String name;
	
	public int getPrice()
	{
		System.out.println("Book Price = "+price);
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public String getName()
	{
		System.out.println("Book Name = "+name);

		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
