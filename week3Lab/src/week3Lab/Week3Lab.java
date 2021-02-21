package week3Lab;

public class Week3Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write array

	/*	int[] array = new int[6];
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;		
		array[3] = 8;
		array[4] = 13;
		array[5] = 6; */
		
		
		int[] array = {1, 5, 2, 8, 13, 6};
		
	//print first element
		
		System.out.println(array[0]);
		
	//print last element not use 5
		
		System.out.println(array[array.length -1]);
	
	//print element @ position 6.  what happens? - out of bounds
		
		//System.out.println(array[6]);
	
	//print elememnt @ position -1 what happens? same as above - out of bounds
		
		//System.out.println(array[-1]);
		
	//write trad for loop that prints out each element in the array
		
		for(int i = 0; i < array.length; i++) {
		System.out.print(array[i] +", "); 
		}
		
		System.out.println();
	//write an enhanced for loop that prints out each elemtn in the array
		
		for(int num : array) {
			System.out.print(num +", ");		
		}
		
		
		
	//create a new var called sum, write a loop that add each eleemnt in the array to the sum
		
		System.out.println();
		
		double sum = 0;
		for(int num : array) {
			sum += num;	
			System.out.println(num);
		}
		
	//create a new var called average and assign the average value of the array to it
		
		double average = sum / array.length;
				System.out.println(average);
				
	//write an enhanced for loop that prints out each number in the array only if the number is odd
		
		for (int num : array) {
			if (num % 2 !=0) {
			
				System.out.println(num);
			}
			
		}
	
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert".
		
		String[] names = {"Sam", "Sally", "Thomas","Robert"};
		
		//calculate the sum of all the letters in the array
		
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
			System.out.println(totalLetters);
			
		//write and test a method that take a String name and prints out a greeting, this method return nothing
		
		greeting("Robert");
		
		//write and test a method that take a String name and returns a greeting, don't print
		
		greeting2("Bowers"); 
		
		// one printed and one didn't
		
		//write and test a method that takes a String and an int and returns true if the number of letter in the string is great than the int
		
		System.out.println(isStringLongerThanNum("Bob", 3)); 
		
		//write and test a method that take an array of string and a string and returns true if the string passed in exists in the array
		
		System.out.println(existsInTheArray(names, "Robert"));
		
		//write and test a method that take an array of int and returns the smallest number in the array
		
		System.out.println(smallestNumber(array));
		
		//write and test a method that take an array of double and return the average
		
		double[] doubles = {3.0, 4.0, 5.0, 6.0};
		System.out.println(theAverage(doubles));
		
		//write and test a method that take an array of String and returns an array of int where each element matches the length of the string at the position
		
		int[] nameLengths = stringLength(names);
		for (int number : nameLengths) {
		System.out.println(number);
		}
		
		//write and test a method that takes an array of strings and return true if the sum of the letters for all strings with an even amount of letter is great than the sum of those with an odd mount of letters
		
		System.out.println(evenVsOdd(names)); 
		
		//write and test a method that takes a string and return ture if the string is a palindrome 
		
		System.out.println(doPalindrome("BOB")); 
				
	} //this ends the org method (this is where i get confused)
	
	
	public static void greeting(String name) {
		System.out.println("Hi "+ name);
		
	}

	public static String greeting2(String name) {
		return "Hi " + name;
	}
	
	public static boolean isStringLongerThanNum(String string, int num) {
		return string.length() >= num;
	}
	
	public static boolean existsInTheArray(String[] array, String string) {
		for (String names : array) {
			if (names.equals(string)) {
				return true; 
			}
		}
		return false; 
	}
	
	public static int smallestNumber(int[] nums) {
		int smallest = nums[0];
		for (int num : nums) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	}

	public static double theAverage(double[] array) {
		double sum = 0;
		for (double num : array) {
			sum += num;
		}
		return sum / array.length; 
	}

	public static int[] stringLength(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results; 
	}
	
	
	public static boolean evenVsOdd(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String str : array) {
			if(str.length() % 2 == 0) {
				evenLetters += str.length();
			} else {
				oddLetters += str.length();
			}
		}
		return evenLetters > oddLetters; 
	}
	
	
	public static boolean doPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
} //this is last closer class


		
