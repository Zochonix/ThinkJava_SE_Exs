/**
*
* A solution class for the final part of exercise 8. (8.7)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Recurse {

	/**
	*
	* Creates primitives and an array and calls methods.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		String input = "nursesrun";
		
		System.out.println(reverseString(input));
		
		if (isPalindrome(input)) {
			
			System.out.println("The word \"" + input + "\" is a palindrome");
			
		}
		
		else if (!isPalindrome(input)) {
			
			System.out.println("The word \"" + input + "\" is not a palindrome");
			
		} 

	}

	/**
	*
	* Returns first character of a given string.
	*
	* @param s A string.
	* @return A character value, representing the first letter of the string.
	*
	*/
	
	public static char first(String s) {
		
		return s.charAt(0);
		
	}

	/**
	*
	* Returns all characters except the first, in a given string
	*
	* @param s A string.
	* @return A string, made up of all letters except the first.
	*
	*/
	
	public static String rest(String s) {
		
		return s.substring(1);
		
	}

	/**
	*
	* Returns all letters except the first and last, in a given string.
	*
	* @param s A string.
	* @return A string, made up of all letters of the parameter,
	* except the first and last.
	*
	*/
	
	public static String middle(String s) {
		
		return s.substring(1, s.length() - 1);
		
	}

	/**
	*
	* Returns the length of a given string.
	*
	* @param s A string.
	* @return A number representing the amount of characters in the string.
	*
	*/
	
	public static int length(String s) {
		
		return s.length();
		
	}

	/**
	*
	* Prints the letters of a given string on separate lines using recursion.
	*
	* @param s A string.
	*
	*/
	
	public static void printString(String s) {
		
		if (length(s) > 0) {
			
			System.out.println(first(s));
			printString(rest(s));
			
		}
		
	}

	/**
	*
	* Prints a given string in reverse, using recursion.
	*
	* @param s A string.
	*
	*/
	
	public static void printBackward(String s) {
		
		if (length(s) == 1) {
			
			System.out.println(first(s));
			
		}
		
		else {
			
		printBackward(rest(s));
		System.out.println(first(s));
		
		}
		
	}

	/**
	*
	* Returns a string which has been reversed using recursion.
	*
	* @param s A string.
	* @return A string that has been reversed
	*
	*/
	
	public static String reverseString(String s) {
		
		if (length(s) == 1) {
			
			return s;
			
		}
		
		else {
			
		String reversedString = reverseString(rest(s));
		String result = reversedString + first(s);
		
		return result;
		
		}
		
	}

	/**
	*
	* Determines whether a given word is a palindrome or not using recursion.
	*
	* @param s A string.
	* @return A true/flase value,
	* stating whether a given word is a palindrome or not.
	*
	*/
	
	public static Boolean isPalindrome(String s) {
		
		if (length(s) == 1) {
			
			return true;
			
		}
		
		String reversed = reverseString(s);
		char first = first(s);
		char last = first(reversed);
		Boolean result = false;
		
		if (first == last) {
		
			Boolean recurse = isPalindrome(middle(s));
			result = recurse;
		
		}
		
		return result;
		
	}

}