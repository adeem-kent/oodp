
public class AnimalDogClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal obj = new Animal("Cat");
		System.out.println(obj.getName());
		
		System.out.println(obj);
		System.out.println(obj.toString());
		
		System.out.println();System.out.println();
		
		Animal a1 = new Animal();
		a1.setName("Lion");
		a1.makeSound();
		System.out.println(a1);
		
		Dog d1 = new Dog();
		System.out.println(d1.getName());
		d1.setName("ABC");
		d1.fetch();
		
		d1.makeSound();
		d1.eats();

	}

}
