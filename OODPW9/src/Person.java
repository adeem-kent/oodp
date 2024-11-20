
public class Person {
	private int id; // instance variables
	private String name;
	public static int x; // static variable (shared among objects)
	public int [] arr;

	// default constructor
	public Person() {
		this.id = 0;
		this.name = null;
		arr = new int [5];
	}

	// parameterized constructor
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		arr = new int [5];
	}
	
	//getters 
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
	//setters
	public void setID(int i)
	{
		id = i;
	}
	public void setName(String n)
	{
		name = n;
	}

	// instance method
	public void display() {
		System.out.println(id + " " + name);
	}
	
	public static void staticMethod()
	{
		System.out.println(x);
	}

}
