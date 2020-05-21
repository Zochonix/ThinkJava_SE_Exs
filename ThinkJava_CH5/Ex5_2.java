import java.util.Random;
import java.util.Scanner;

public class Ex5_2 {

	public static void main(String[] args) {
		
		int attempts = 0;
		
		inputNumber(attempts);
		
	}
	
	public static void inputNumber(int attempts) {
		
		// Declare the required integer variables to store the user's guess and the randomly
		// generated guess as well as the difference between the two numbers.
				
		int enteredNumber, randomNumber;
		Scanner inputScanner = new Scanner(System.in);
		Random randomInstance = new Random();
		randomNumber = randomInstance.nextInt(100) + 1;
		
		// Tell the user the aim of the game and to enter a number.
		
		System.out.println("Am thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		System.out.print("Enter a number: ");

		enteredNumber = inputScanner.nextInt();
		
		attempts = attempts + 1;
		
		checkNumber(enteredNumber, randomNumber, attempts, inputScanner);
		
	}

	public static void checkNumber(int enteredNumber, int randomNumber, int attempts, Scanner inputScanner) {
		
		// Compute the difference.
		
		int difference = randomNumber - enteredNumber;
		
		if (difference == 0) {
			
			System.out.println("Your guess is: " + enteredNumber);
			System.out.println("The number I was thinking of is: " + randomNumber);
			System.out.println("Congratulations, you won!");
			inputScanner.close();
			System.exit(0);
			
		}
		
		else if (difference != 0) {
			
			System.out.println("Your guess is: " + enteredNumber);
			System.out.println("The number I was thinking of is: " + randomNumber);
			System.out.println("You were out by: " + difference);
			
			if (attempts == 3) {
				
				System.out.println("You have used up all of your attempts! Better luck next time.");
				inputScanner.close();
				System.exit(0);
				
			}
			
			else if (attempts < 3) {
				
				System.out.println("Try again");
				inputNumber(attempts);
				
			}
			
		}
		
	}

}