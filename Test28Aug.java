import java.lang.ref.Cleaner.Cleanable;
import java.util.*;

class Data1 implements Cloneable
{
	
	
	public void show() 
	{
	System.out.println("Show the method");
	}
	//@Override  
	protected Object clone() throws CloneNotSupportedException   
	{   
	//invokes the clone() method of the super class      
	return super.clone();   
	}
}

class Test28Aug
{
	
	public static void main(String[] args)
	{
		 String name;
		 String id;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id and Name is ");
		
		name=sc.next();
		id = sc.next();
	
		Data1 s =new Data1();
		try {  
			Data1 s1 = (Data1)s.clone();  
			System.out.println(id + " " +name);  
			}catch (Exception e) {  
			// TODO: handle exception  
			System.out.println(s.toString());  
			}  
		
		s.show();
		
	}
}