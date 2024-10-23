
public class arraysBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		int a;
		a = 10;
		
		//arrays
		int [] marks = new int [5];
		char grades [];
		grades = new char [3];
		
		marks[0] =10;
		marks[1] =20;
		marks[2] =marks[1] * marks[0];
		marks[3] =40;
		marks[4] =50;
		
		System.out.println(marks);
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		grades [0]='A';
		grades [1]='B';
		grades [2]='F';
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
*/		

/*
		// loops
		int [] marks = new int [5];
		for (int i = 0 ; i < 5 ; i++)
		{
			marks[i] = i+1;
		}
		//display
		for (int i = 0 ; i < 5 ; i++)
		{
			System.out.print(marks[i]+ " ");
		}
		System.out.println();
		// initialization
		
		double balance[] = {50.9, 60.6, 70.0};
		for (int i = 0 ; i < balance.length ; i++)
		{
			System.out.print(balance[i] + " ");
		}
		
		String names[] = {"abc", "xyz"};

*/
	
/*
		// random
		int n = 5;
		double [] a = new double [n];
		for (int i = 0 ; i < a.length ; i++) 
		{
			a[i]= Math.random();
			System.out.print(a[i] + " ");
		}
		
		// max in the array
		System.out.println();
		double max = a[0];
		for (int i = 1 ; i < a.length ; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("max: " + max);
		
		// sum of the array
		double sum = 0.0;
		for (int i = 0 ; i < a.length ; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("sum: " + sum);
		System.out.println("average: " + sum/a.length);
		
*/
		
/*		
		/////reverse
		int reverse[] = {1,2,3,4,5};
		int n = 5;
		for (int i = 0 ; i < n/2 ; i++) 
		{
			int temp = reverse[i];
			reverse[i] = reverse[n-i-1];
			reverse[n-i-1] = temp;
		}
		
		//display
		for (int i = 0 ; i <reverse.length  ; i++) 
		{
			System.out.print(reverse[i]+ " ");
		}
		
		
		////////shallow copy
		int b [] = new int[n];
		b = reverse;
		
		//deep copy
		int c[] = new int [n];
		for (int i = 0 ; i <reverse.length  ; i++)
		{
			c[i]= reverse[i];
		}
		
*/		
		///////2d arrays
		
		int [][] a = new int [3][3]; //row and then column
		
		a[2][2] =100;
		a[0][2]= 50;
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 3 ; j++)
			{
				a[i][j] = j;
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 3 ; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
