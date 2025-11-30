
public class forLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while loop
/*		int number = 1; // init
		while (number <= 10) // condition
		{
			System.out.println(number);
			number = number + 1; //increment/decrement
		}
*/	
		
		// for loops
/*		for (int num = 1; num <= 10; num = num + 1)
		{
			System.out.println(num);
		}
*/
		
		// for loops with increment operator
/*			for (int num = 1; num <= 10; num++)
		{
			System.out.println(num);
		}
*/

		// for loops with increment operator
		for (int num = 1; num <= 10; num = num + 3)
		{
			System.out.println(num);
		}
		for (int num = 1; num <= 10; num += 3)
		{
			System.out.println(num);
		}
		for (int num = 10; num >= 1; num -= 2)
		{
			System.out.println(num);
		}
		
	}

}
