
public class Hanoi
{
 static  void Hanoi(int n, char a,char c,char b)
  {
   if(n==1)
   System.out.println(""+a+"--->"+""+c);
   else
   {
   Hanoi(n-1,a,b,c);
   System.out.println(""+a+"--->"+""+c);
   Hanoi(n-1,b,c,a);
   }
  }
  
 public static void main(String []args)
 {
     Hanoi(4,'A','C','B');
    
 }
}

 
 