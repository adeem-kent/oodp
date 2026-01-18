
// way to achieve compile time polymorphism
public class CompileTimePolymorphism {
	
	//1. method overloading
	public int add (int a, int b)
	{
		return a+b;
	}
	public int add (int a, int b, int c)
	{
		return a+b+c;
	}
	public double add (double a, double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		
		System.out.println(obj.add(1.0, 2.5));
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1,2,3));
	}

}
