
// child class (derived class) (subclass)
public class Dog extends Animal{

	public Dog()
	{
		super(); // calling the default constructor of a parent class
	}
	
	public Dog(String name)
	{
		super(name); // calling the parametrized constructor of a parent class
	}
	
	//overriding 
	public void makeSound()
	{
		super.makeSound(); // method makeSound of parent class
		
		// additional functionalities
		System.out.println("Dog Barks");
	}
	
	public void fetch()
	{
		System.out.println(getName() + " is fetching the ball");
	}
	
	public String toString() {
		return "Dog is " + getName();
	}
}
