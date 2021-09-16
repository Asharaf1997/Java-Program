import java.util.*;

public class fact
{
	static int fact(int n)
	{
	  int f=1;
	  if(n==0)
	  return 1;
	  else 
	  f=n*fact(n-1);
	  return f;
	}
	public static void main(String argd[])
	{	
		Scanner scan=new Scanner(System.in);
		int n; 
		System.out.println("enter the numbers");
		n=scan.nextInt();
		System.out.println("Factorial is="+fact(n));
	}
}
