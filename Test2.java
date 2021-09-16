
public class Test2 
{
	public static void main(String args[])
	{
		//IAmAnInterface1 ref=a->System.out.println("Square of="+(a*a));
		 IAmAnInterface1 ref=(a,b)->{return(a+b);};
		 
		int x=ref.sum(7, 7);
		System.out.println("Addition is="+x);
		//()->{};
	
	}
}
