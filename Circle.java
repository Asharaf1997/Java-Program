
 class Circle1 {
	float pi = 3.14f;
	
	float area(float r)
	{
		float ans;
		ans=pi*r*r;
		return ans;
		
	}
}
public class Circle
 {
	 
  public static void main(String[] args) 
  {
		Circle1 c = new Circle1();
		float ans = c.area(1.5f);
		System.out.println("Area ="+ans);

	}

}

