/**
*
* A solution class for the final part of exercise 9. (9.6)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex9_6 {

	/**
	*
	* Calls methods.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		String input = "bananas";
		
		int number = check(input);
		
		System.out.println(number);

	}

	/**
	*
	* Returns an integer value that suggests whether a string has the same number
	* of opening and closing parentheses or not.
	*
	* @param input A strting to be checked.
	* @return A number signifying whether there is a missing parenthesis or not.
	*
	*/
	
	public static int check(String input) {
		
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			
			char c = input.charAt(i);
			
			if (c == '(') {
				
				count++;
				
			}
			
			else if (c == ')') {
				
				count--;
				
			}
			
		}
		
		return count;
		
	}

}
