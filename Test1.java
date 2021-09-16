
public class Test1
{
public static void main(String[] args) 
{
		
	IAmAnInterface ref= new IAmAnInterface()
			{
			public void show()
			{
				System.out.println("inside inner class");
			}
			};
			
			ref.show();
		
	//	DemoEx obj1=new DemoEx();
		//obj1.show();
		
		
  // 	IAmAnInterface ref=new DemoEx(); // up casting		
  //  ref.show();
		
 // 	ref.m1();
		
//	IAmAnInterface ref=null;
   // ref.m1();
//	IAmAnInterface.m2();
// in the above code we used interface ref to create 
// child class object

	
	}
}
