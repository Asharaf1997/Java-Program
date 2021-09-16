
/*
public class ArrayTest 
{
    static void meth(int ...a)
    {
    	  System.out.println("this is verge method for int="+a.length);
    }
    
    static void meth(float ...a)
    {
    	  System.out.println("this is verge method for float="+a.length);
    }
    
    static void meth(double ...a)
    {
    	  System.out.println("this is verge method for double="+a.length);
    }
    
    static void meth(boolean ...a)
    {
    	  System.out.println("this is verge method for boolean="+a.length);
    }
	public static void main(String[] args)
	{
	//Scanner scan=new Scanner(System.in);
	//int i; 
	//int a[]={11,22,33,44,66};
//	int []a2= {11,22,33};
	//int a[]=new int[10];
	
	//for(int x:a)
	//System.out.println(a.length);
//	System.out.print(a2[i]);
//	System.out.println(a3[i]);
	//	for(int i=0;i<a.length;i++)
		//	System.out.println(a[i]);
		ArrayTest at=new ArrayTest();
		
		ArrayTest.meth(11,22,33);
		ArrayTest.meth(false);
		ArrayTest.meth(11.000,33.98,87.99);
		ArrayTest.meth(11.00f,33.76f);
		
		
	}
		 
}

class A{
int i=100;
}
class B extends A
{
int i=200; // hide i of A

void show(){
System.out.println(super.i);
System.out.println(i);
}

}

class ArrayTest{

public static void main(String args[]){

B b=new B();
b.show();



}

}*/
	
class A

{
	A(int a)
	{
	int i=100;
	System.out.println(" this A const");
	}
}

class B extends A
{
	B(int x)
	{
	super(10);	
	int i=200;
	System.out.println("this 1 arg const of B");
	}


B(){

super(100);
System.out.println("CTor of B");
}
}
//void show()
//{
// System.out.println(super.i);	
 //System.out.println(i);
//}

class ArrayTest{

public static void main(String ash[])
{

 B b = new B();
 B b1= new B(100);
// at.show();
}
}