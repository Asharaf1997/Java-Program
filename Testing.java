class Data3<T, D>
{
	T o;
	D d;
	
	Data3(T o,D d){
		this.o=o;
		this.d=d;
	}

	@Override
	public String toString()
	{
		return "Name = " + o +"\nNumber = " +d;
	}

	public Object getO() {
		return o;
	}
	
	public Object getD() {
		return d;
	}
	
	public void show()
	{
		System.out.println(""+o.getClass().getName());
		
		System.out.println(""+d.getClass().getName());
	}
}


public class Testing 
{
	public static void main(String[] args)
	{
		/*Data3 d1 = new Data3("Asharaf");
		Data3 d2 = new Data3("shaikh");
		Data3 d3 = new Data3(123);
		Data3 d4 = new Data3(new Exception());
		Data3 d5 = new Data3(new Data3('A'));
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
		d1.show();
	//	d3.show();
		//d5.show();*/
		
		Data3<String,Integer> al = new Data3<String, Integer>("Asharaf",100);
		
		al.show();
		System.out.println(al);
	}
}
