import java.util.*;

public class Fibonacci
{
    
	public static void main(String args[])
	{
	   Scanner scan=new Scanner(System.in); 
	   int range;
	   int a=0, b=1, c;
	   
	   System.out.println("Enter range: ");
	  
	   
	   range=scan.nextInt();
	 // a=scan.nextInt();
	   
	   while (a<=range)
	   {
	     System.out.println("  "+a);
	     c = a+b;
	     a = b;
	     b = c;
	   }
   }
}