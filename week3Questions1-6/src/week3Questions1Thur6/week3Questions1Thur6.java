

package week3Questions1Thur6;

public class week3Questions1Thur6 {
	
	public static void main(String[]args) {
		
	
		/* 1.)
		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		
		//a.)
		int[] ages1 = {3, 9, 23, 64, 2, 8, 38};

		int lengthOfProblem = ages1.length;
		int subtraction = ( ages1[lengthOfProblem - 1] - ages1[lengthOfProblem - lengthOfProblem]);

		System.out.println("The answer is " + subtraction);
		
		
		//b.)
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 58};

		int lengthOfProblem2 = ages2.length;
		int subtraction2 = ( ages2[lengthOfProblem2 - 1] - ages1[lengthOfProblem2 - lengthOfProblem2]);

		System.out.println("This answer should be " + subtraction2);
		
	
		//c.)
		
		int[] agesAvg = ages2;
		double total = 0;
		
		for (int i = 0; i < agesAvg.length; i++) {
			total = total + agesAvg[i];
		}
		
		double average = total / agesAvg.length;
		
		System.out.println("The average age of the group is " + average);
		

		/* 2.)
		 Create an array of String called names that contains the following values: 
		 “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. 
		 a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console. 
		 b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 */ 
		
		//a.)
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		total = 0;
		for (int i = 0; i < names.length; i++) {
			total += names[i].length();
		}
		average = total / names.length;
		System.out.println("The average number of letters per name in names " + average );
		
		//b.)
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();
		
		//System.out.println(names.length);
		
		//System.out.println(names[names.length]);
		
		String firstNum = names[0];
		String lastNum = names[names.length - 1];
		
		System.out.println(lastNum);
		System.out.println(firstNum);
		
		//5.)
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		 
			System.out.print(names[i] + " has " + nameLengths[i] + " letters; ");
		 }
		
		//break
		System.out.println();
		
		//6.)
		
		total = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			total += nameLengths[i];
		}
		
		System.out.println("The total number of letters are " + total);
		
		
		

		
	
	
		
		

	
	

	}
	
		
	
}
