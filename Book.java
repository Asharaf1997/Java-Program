import java.util.*;
class Book 
{
public static void main(String arg[])
{
	Scanner s = new Scanner(System.in);
	String book_title;
	int book_price;
	System.out.print("Enter Book Title:");
	book_title = s.next();
	System.out.print("Enter Book price:");
	book_price = s.nextInt();
	
	BookInfo b=new BookInfo(book_price, book_title);
	
	b.setName(book_title);
	b.setPrice(book_price);
	b.getName();
	b.getPrice();
}
}