
public class Ex9_6 {

	public static void main(String[] args) {
		
		String input = "bananas";
		
		int number = check(input);
		
		System.out.println(number);

	}
	
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
