
// Parent class (Base class) (superclass)
public class Animal {
	
	private String name;
	
	// 2. constructor overloading (way to achieve compile time Polymorphism)
	public Animal() {
		this.name = "Unknown Animal";
	}
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	//getters
	public String getName() {
		return name;
	}
	//setters
	public void setName(String name)
	{
		this.name =name;
	}
	
	public void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
	
	public void eats()
	{
		System.out.println("Animal eats");
	}
	
	// Run time polymorphism -> overriding the method
	public String toString()
	{
		return "Animal name is: " + name;
	}
	

}
