import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your pay: ");
		double pay = sc.nextDouble();
		
		double savings = pay * 0.10;
		
		System.out.println("Your savings are: " + savings + "$");

		sc.close();
	}

}
