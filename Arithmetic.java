import java.util.*;

public class Arithmetic {

	public static void main(String[] args) 
	{
		//int i;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		
		int c[]=new int[3];//Addition
		int s[]=new int[3];//Substraction
		int m[]=new int[3];//Multipication
		int d[]=new int[3];//Division
		
		System.out.println("Enter the number a and b is");
		for(int i=0;i<3;i++)
		a[i]=sc.nextInt();
		
		for(int i=0;i<3;i++)
		b[i]=sc.nextInt();
		
		for(int i=0;i<3;i++)
		c[i]=a[i]+b[i];
		
		for(int i=0;i<3;i++)
			s[i]=a[i]-b[i];
		
		for(int i=0;i<3;i++)
			m[i]=a[i]*b[i];
		
		for(int i=0;i<3;i++)
			d[i]=a[i]/b[i];
		
		System.out.println("\nArray a");
		for(int i=0;i<3;i++)
			System.out.print(a[i]+"\t");
			
		System.out.println("\nArray b");
		for(int i=0;i<3;i++)
			System.out.print(b[i]+"\t");
			
		System.out.println("\nArray c additin ");
		for(int i=0;i<3;i++)			
			System.out.print(c[i]+"\t");
	
		System.out.println("\nArray s subtraction ");
		for(int i=0;i<3;i++)			
			System.out.print(s[i]+"\t");
		
		System.out.println("\nArray m multipication");
		for(int i=0;i<3;i++)
			System.out.print(m[i]+"\t");
		
		System.out.println("\nArray d division");
		for(int i=0;i<3;i++)
			System.out.print(d[i]+"\t");
	}

}