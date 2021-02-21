package week3Question9;

public class Question9 {

	public static void main(String[] args) {
		
		/* I could figure out how to sum the array and i could figure out how to look at the number of elements in the array
		but i couldn't figure out how to do a sum and greater than in the array.*/
		
		
		/*int[] newArray = new int[7]; just was playing around writing code like this
		newArray[0] = 3;
		newArray[1] = 9;
		newArray[2] = 23;
		newArray[3] = 64;
		newArray[4] = 2;
		newArray[5] = 8;
		newArray[6] =38;*/
		
		int[] Array = {3, 9, 23, 64, 2, 8, 38}; 
		
		int sum = sumArray(Array);
		System.out.println("This is the sum " + sum);
		
		System.out.println("This is only " + isArrayGreaterThan100(Array, 5) + " for the number of elements in the array"); 
		}
  		
	public static int sumArray(int[] numbers) {
	int sum = 0;
	for (int number : numbers) {
		sum += number;
	
	}
	
	return sum;
	
	}

	
	public static boolean isArrayGreaterThan100(int[] array, int num) {
		
		
		return array.length >= num;   
		
	}
}
