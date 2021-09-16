
public class CalcAverage
{
	public double avgFirstN(int N) throws IllegalArgumentException
	{
		int sum=0;
		double avg=0.0d;
		
		if(N<0)
		{
			System.out.println("N is not a natural number");
		}
		
		else
		{
			for(int i=1;i<N;i++)
				
				sum=sum+i;
			avg=sum/N;
		}
		return avg;
	}
	


 public static void main(String args[])
 {
	 CalcAverage  cl = new CalcAverage();
	 try
	 {
		 System.out.println(c1.avgFirstN[10]);
	 }
	 catch(IllegalArgumentException e)
	 {
	 System.out.println(e.getMessage());
	 }
 }
}
 