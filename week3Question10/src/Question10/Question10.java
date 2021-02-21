package Question10;

public class Question10 {
	


	public static void main(String[]args) {
	
		
		double[] doubleArray = new double[7];
		
		doubleArray[0] = 3.0;
		doubleArray[1] = 9.0;
		doubleArray[2] = 23.0;
		doubleArray[3] = 64.0;
		doubleArray[4] = 2.0;
		doubleArray[5] = 8.0;
		doubleArray[6] =38.0;
		
		System.out.print(average(doubleArray)); 
		
	}
	
		public static double average(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		
		return sum / numbers.length; 
		
		
	}

	
}
