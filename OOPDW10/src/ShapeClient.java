// using the parent reference and child object
public class ShapeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle(5.0);
		Shape s2 = new Rectangle(5.0, 10.0);

		System.out.println(s1.calculateArea()); // circle
		System.out.println(s2.calculateArea()); // Rectangle
	}

}
