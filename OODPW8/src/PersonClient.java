
public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.id = 1;
		p1.name = "xyz";
		p1.number = 12345;
		p1.address = "sydney";
		
		p2.id = 2;
		p2.name = "abc";
		p2.number = 98765;
		p2.address = "darwin";
		
		System.out.println(p1.name);
		
		p1.display();
		p2.display();
	}

}
