
import java.util.*;

public class ImplRel implements Relational
{
int a,b;


	public ImplRel(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}

	@Override
	public void greaterThan() 
	{
		if(a>b)
		{
			System.out.println("a is grater than b");
		}
		else
		{
			System.out.println("a is less than b");
		}
		
	}

	@Override
	public void lessThan() 
	{
		// TODO Auto-generated method stub
		if(a<b)
		{
			System.out.println("a is less than b");
		}
		else
		{
			System.out.println("b is greater than b");
		}
		
	}

	@Override
	public void greaterThaneq() {
		// TODO Auto-generated method stub
		if(a>=b)
		{
			System.out.println("a is grater than equal to b");
		}
		else
		{
			System.out.println("b is less than equal to a");
		}
	}
	
	public void lessThaneq()
	{
		if(a<=b)
		{
			System.out.println("a is less than equal to b");
		}
		else
		{
			System.out.println("b is grater than equal to a");
		}
	}

	public static void main(String args[])
	{
		int a,b;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the value of a and b is");
		a=scan.nextInt();
		b=scan.nextInt();
		
		ImplRel impl=new ImplRel(a, b);
		
		impl.greaterThan();
		impl.lessThan(); 
		impl.greaterThaneq();
		impl.lessThaneq();
	
		
	}
}
