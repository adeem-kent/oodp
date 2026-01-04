
public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first");
		temp(); // function call
		temp(); // function call
		temp(); // function call
		System.out.println("last");

		int a = 5, b = 10; // local variables
		int result = add(a, b, "name");

		System.out.println(result);
	}

	public static void temp() {
		System.out.println("Hello world");
	}

	public static int add(int x, int y, String name) {
		System.out.println(x + y);
		System.out.println(name);
		int z = x + y + 100;
		return z;
	}

}
