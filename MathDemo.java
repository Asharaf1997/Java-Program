import java.util.*;

public class MathDemo 
{

	public static void main(String[] args) 
	{
		double a;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the value ");
		a=scan.nextDouble();
		
		ImplMath  impl=new ImplMath(a);
		impl.sqr(a);
		impl.cube(a);
		impl.cosine(a);
		impl.sine(a);
		
		
	}

}