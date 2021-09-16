import java.util.concurrent.TimeUnit;

public class TestThreads 
{
	public static void main(String[] args) 
	{
	/*	System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getClass());
		System.out.println(Thread.currentThread().getContextClassLoader());*/
		
		Bun t1 = new Bun();
	//	t1.start();
		
		System.out.println("Start");
		for(int i=0;i<10;i++)
		{
			System.out.println("Hii hello Bun"+i+Thread.currentThread());
			try
			{
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e)
			{
				// TODO: handle exception
				e.printStackTrace();
			};
			
		}
		
	/*	Thread t1 = new Thread();
		
		Runnable r = new Thread();
		
		Thread t = new Thread(r);
		
		Runnable r1=new Runnable() 
		{
			
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				
			}
		};*/
		System.out.println("Shop Close");
	}
}

//TimeUnit.sleep