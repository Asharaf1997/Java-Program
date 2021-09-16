import java.util.*;

public class mul
{
	static int mul(int a,int b)
	{
	  int m=0;
	  if(b==0)
	  return 0;
	  else 
	  m=m+mul(a,b-1)+a;
	  return m;
	}
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		int n,a,b; 
		System.out.println("Enter the numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Multiplication is="+mul(a,b));
	}
}
