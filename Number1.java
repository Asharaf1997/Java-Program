class Number1
{
 public static void main(String args[])
 {
  int n,i,sum=0;
  
  for(i=0;i<5;i++)
  {
  
  n=Integer.parseInt(args[i]);
  System.out.println(Integer.parseInt(args[i]));
  
  sum=sum+Integer.parseInt(args[i]);
 
    }
  System.out.println("Addition of Five number is="+sum);
 }
}