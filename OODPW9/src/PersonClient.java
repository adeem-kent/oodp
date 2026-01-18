
public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1= new Person();
		Person p2= new Person(5, "xyz");
		Person p3= new Person();
		
		p1.display();
		p2.display();
		
		//System.out.println(p1.id);
		//p1.id = 100;
		//p1.name = "abc";
		
		// using getters and setters
		System.out.println(p1.getID());
		p1.setID(100);
		p1.setName("abc");
		
		p1.x = 100;
		System.out.println(p2.x); // 100
		System.out.println(Person.x); // 100
		
		Person.staticMethod();
		
		int [] temp = {1,2,3,4,5};
		p1.arr = temp;
		
	}

}
