import java.util.Scanner;

public class example1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number of values: ");
		int max = sc.nextInt();
		
		int sum = 0; // contain the sum of the values 
		int count = 1; 
		
		while (count <= max)
		{
			System.out.print("Enter number: ");
			int num = sc.nextInt();
			sum += num;
			count++;
		}
		
		System.out.println("the sum is: " + sum);
		sc.close();
		
	}

}
