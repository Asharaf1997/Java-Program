import java.util.ArrayList;

class Student<T>{
	private T variable;

	public Student(T variable) {
		this.variable = variable;
	}

	@Override
	public String toString() {
		return "" + variable;
	}

	public T getVariable() {
		return variable;
	}
	
}
 

class GenericClass<T>{
	private T variable;

	public GenericClass(T variable) {
		this.variable = variable;
	}

	@Override
	public String toString() {
		return "" + variable;
	}

	public T getVariable() {
		return variable;
	}
	
}
 
public class Testing1 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Anuja"));
		list.add(new Student("Vibha"));
		list.add(new Student("Pranita"));
		list.add(new Student("Zeeeeba"));
		list.add(new Student("Powar"));
		
		for(Student s: list)
		System.out.println(s);
		
		
		
		
		
		
		//System.out.println(new GenericClass<String>("Some text"));
				//System.out.println(new GenericClass<Double>(2.0));
				//System.out.println(new GenericClass<Character>('#'));
				
	/*ArrayList<GenericClass> list = new ArrayList<>();
				
				
				list.add(new GenericClass<Integer>(1));
				list.add(new GenericClass<Integer>(2));
				list.add(new GenericClass<String>("String"));
				list.add(new GenericClass<Integer>(4));
				list.add(new GenericClass<Integer>(5));
				list.add(new GenericClass<Integer>(6));

				
				for(GenericClass i:list){
				System.out.println(i);	
				}*/

	}

}