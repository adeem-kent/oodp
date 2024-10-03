import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.println("The input num is: " + num + " for a name: " + name);

	}

}
