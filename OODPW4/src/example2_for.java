import java.util.Scanner;

public class example2_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number of values: ");
		int max = sc.nextInt();
		
		int sum = 0; // contain the sum of the values 
		
		for(int count = 1; count <= max;count++ )
		{
			System.out.print("Enter number: ");
			int num = sc.nextInt();
			sum += num;
			
		}
		
		System.out.println("the sum is: " + sum);
		sc.close();

	}

}
