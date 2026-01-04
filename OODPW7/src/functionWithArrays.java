
public class functionWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		
		int [] returnedArray = changeArray(arr);
		
		System.out.println(arr[0]);
		System.out.println(returnedArray[0]);
	}
	
	public static int[] changeArray(int [] temp)
	{
		System.out.println(temp[1]);
		temp[0] = 100; // changes the original arr as well
		
		int newArray [] = {10,20,30};
		
		return newArray;
	}

}
