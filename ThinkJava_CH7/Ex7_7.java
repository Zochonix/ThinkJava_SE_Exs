public class Ex7_7 {

	public static void main(String[] args) {
		
		String word = "apple";
		
		letterHist(word);

	}
	
	public static int[] letterHist(String input) {
		
		input = input.toLowerCase();
		
		int[] numberOfCharacters = new int[26];
		
		for (int i = 0; i < input.length(); i++) {
			
			char letter = input.charAt(i);
			int index = letter - 'a';
			numberOfCharacters[index]++;
			
		}
		
		return numberOfCharacters;
		
	}

}
