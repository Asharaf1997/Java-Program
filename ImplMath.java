
public class ImplMath implements MyMath
{
	double a;
	

	public ImplMath(double a) {
		super();
		this.a = a;
	}
	
	@Override
	public double sqr(double a) {
		System.out.println("Square is"+(a*a));
		return 0;
	}

	@Override
	public double cube(double a) {
		System.out.println("Cube is"+(a*a*a));
		return 0;
	}

	@Override
	public double cosine(double a) {
		System.out.println("Cosine"+Math.cos(a));
		return 0;
	}

	@Override
	public double sine(double a) {
		System.out.println("Sine"+Math.sin(a));
		return 0;
	}

}
