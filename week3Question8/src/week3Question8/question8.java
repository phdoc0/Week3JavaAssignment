package week3Question8;

public class question8 {

	public static void main(String[] args) {
	
		
		
		String firstName = "Robert";
		String lastName = "Bowers";
		String fullName = createMyFullName(firstName, lastName);
			
		System.out.println(fullName);
		
	}

	
	public static String createMyFullName(String x, String y) {
		String fullName = x + " " +y;
		return fullName;
		
		//could just use this statment: return  x + " " +y; where Strung fullName is
	
	}

}
