
public class Recurse {

	public static void main(String[] args) {
		
		String input = "apple";
		
		printString(input);
		printBackward(input);

	}
	
	public static char first(String s) {
		
		return s.charAt(0);
		
	}
	
	public static String rest(String s) {
		
		return s.substring(1);
		
	}
	
	public static String middle(String s) {
		
		return s.substring(1, s.length() - 1);
		
	}
	
	public static int length(String s) {
		
		return s.length();
		
	}
	
	public static void printString(String s) {
		
		if (length(s) > 0) {
			
			System.out.println(first(s));
			printString(rest(s));
			
		}
		
	}
	
	public static void printBackward(String s) {
		
		if (length(s) == 1) {
			
			System.out.println(first(s));
			
		}
		
		else {
			
		printBackward(rest(s));
		System.out.println(first(s));
		
		}
		
	}

}
