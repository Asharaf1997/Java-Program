public class Data 
{
   public Data(int i,int j)
   {
	   this(j);
	   System.out.println("2 arg Constuctor call");
   }
   public Data(int i)
   {	
	   this();
	   System.out.println("1 args Constructor call");
   }
   public Data()
   {
	   
	   System.out.println("0 args constructor call");
   }
   
   void show()
   {
	   System.out.println("show call");
   }

}
