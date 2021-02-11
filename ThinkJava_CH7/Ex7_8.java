import java.util.Arrays;

public class Ex7_8 {

	public static void main(String[] args) {
		
		String wordOne = "bob";
		String wordTwo = "obb";
		Boolean areEqual = false;
		
		areEqual = areAnagrams(wordOne, wordTwo);
		
		if (areEqual) {
			
			System.out.println(wordOne + " and " + wordTwo + " are anagrams.");
			
		}
		
		if (!(areEqual)) {
			
			System.out.println(wordOne + " and " + wordTwo + " are not anagrams.");
			
		}
		
	}
	
	public static boolean areAnagrams(String wordOne, String wordTwo) {
		
		int[] histOne = letterHist(wordOne);
		int[] histTwo = letterHist(wordTwo);
		
		if (Arrays.equals(histOne, histTwo)) {
			
			return true;
			
		}
		
		return false;
		
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
