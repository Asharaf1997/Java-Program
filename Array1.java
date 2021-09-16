import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class Array1
{

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Solapur");
		al.add("Raigad");
		
		Iterator<String> it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------------------First-----------------------");
		
		Collections.sort(al);
		
		it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------------Second-------------------------");
		
		ListIterator<String> li=al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
			
		}
		
		System.out.println("-----------------Previ-------------------------");
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
			
		}
		System.out.println("--------Inhance for-------");
		for(String s:al)
			System.out.println(s);
		
	
	}
}
