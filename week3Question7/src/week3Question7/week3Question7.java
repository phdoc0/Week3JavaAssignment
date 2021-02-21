package week3Question7;



public class week3Question7 {

	public static void main(String[] args) {
		//7.)  is this considered a method?????
		//String phrase = "Hip Hip Hurray! ";
		//System.out.println(phrase.repeat(3));
			
		
		System.out.println(phrase("Hello", 3));
	}
		
		
		public static String phrase(String str, int num) {
			String results = "";
			for(int i = 0; i < num; i++) {
				results += str;
			}
			return results; 

	}

}
