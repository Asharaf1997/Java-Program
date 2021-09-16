import java.util.*;

public class Armstrong 
{
 public static void main(String args[])
 {
	 int i,original,rem,result=0,num;
	 
	 
	 System.out.println("Enter the Armstrong number");
     Scanner scan=new Scanner(System.in);
	 
	 num=scan.nextInt();
	 
	 original = num;
	 
	  while(original != 0)

	  {
	   
	    rem=original%10;
	 
	    original=original /10;

       result =result+(rem*rem*rem);
	  
      }

	      if(result == num)
	      {
	     System.out.println("Armstrong number="+num);
	      }
	    else 
	     { 
	    System.out.println("Not Armstrong number="+num);
	 
	     }
	    
	 }
	  

 }

