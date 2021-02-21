
package week3Question11;

public class week3Question11 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//best i could do, wa

		double [] array1 = {1.1, 2.2};
		
		double[] array2 = {3.3, 4.4};
		
	
	System.out.println(theAverage1(array1));
	
	System.out.println(theAverage2(array2));
	


} //class

public static double theAverage1(double[] array1) {
	double sum = 0;
	for (double num : array1) {
		sum += num;
	}
	return sum / array1.length; 


}


public static double theAverage2(double[] array2) {
	double sum = 0;
	for (double num : array2) {
		sum += num;
	}
	return sum / array2.length; 
}

//if theAverage1 > theAverage2 = true else print false. 

public static double theAverageGreater(double[] array1, double[] array2) {
	
	if ( array1 > array2) {
		System.out.println("true");
	} else {
		System.out.println("False");
	}
	
}


} //last one


