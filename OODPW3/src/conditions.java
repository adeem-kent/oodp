
public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x = 10, y = 20;
//		if (x > 0)
//		{
//			// true
//			System.out.println("x is greater than 0");
//		}
//		System.out.println("program finished");
//		
//		//////////////////////////////////
//		if (x+1 < 0 && y > 20)
//		{
//			// true
//			System.out.println("x is less than 0");
//		}
		
		////////////////////// if else example
		
/*		int x = 0, y = 20;
		if (x > 0)
		{
			System.out.println("x is positive");
		}
		else
		{
			System.out.println("x is negative or zero");
		}
		
		System.out.println("program finished"); */
		
		/////////////////////////if else example (even or odd)
		
/*		int number = 9;
		if (number % 2 == 0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		////////////////
		if (number % 2 != 0)
		{
			System.out.println("number is odd");
		}
		else
		{
			System.out.println("number is even");
		}
		*/
		/////////////////////////// if and else if
		
	/*	int x = -10, y = 100;
		if (x > 0)
		{
			System.out.println("x is positive");
		}
		else if (x < 0)
		{
			System.out.println("x is negative");
		}
		else
		{
			System.out.println("x is zero");
		} 
		*/
		
		/////////////if and else if difference
		
//		int x = 20, y = 10;
		/// example 1
//		if (x > 0)
//		{
//			System.out.println("x is greater than 0");
//		}
//		if (y > 0)
//		{
//			System.out.println("y is greater than 0");
//		}
		
		/// example 2
//		if (x > 0)
//		{
//			System.out.println("x is greater than 0");
//		}
//		else if (y > 0)
//		{
//			System.out.println("y is greater than 0");
//		}
		
		/////////////////////////////////////////////
		
/*		int age = 50;
		if (age <= 12 || age >= 60)
		{
			System.out.println("outter boundary");
		}
		
		if (age >= 10 && age <= 60)
		{
			System.out.println("inner boundary");
		}
*/
		
	////////////////////////////incorrect way of using conditions
		
/*		int marks = 70;
		if (marks > 50)
		{
			System.out.println("C");
		}
		else if (marks > 60)
		{
			System.out.println("B");
		}
		else if (marks > 70)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("F");
		}
	*/
		
		//////////////////// solution = use ranges
		
		int marks = 49;
		if (marks >= 70)
		{
			System.out.println("A");
		}
		else if (marks >= 60 && marks < 70)
		{
			System.out.println("B");
		}
		else if (marks >= 50 && marks < 60)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("F");
		}
		
	}

}
