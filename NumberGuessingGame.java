package beginnerProjects;
import java.util.*;
public class NumberGuessingGame {
	public static void main (String []args) {
		
		Random random = new Random();
		int myNum = random.nextInt(101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("The number is between 0-100.");
		System.out.print("Enter your first guess: ");
		int myGuess = input.nextInt();
		
		if (myGuess > 100 || myGuess < 0) {
			System.out.println("Your number is outside the allowed value.");
		}	
		
		if (myGuess != myNum) {
			if (myGuess > myNum) {
				System.out.println("Your value is higher than the number.");
			}	else {
				System.out.println ("Your value is lower than the number.");
			}
		}
		
		
		while (myGuess != myNum) {
			System.out.print("Enter your guess: ");
			myGuess = input.nextInt();
			
			if (myGuess > 100 || myGuess < 0) {
				System.out.println("Your number is outside the allowed value.");
			}
			
			if (myGuess != myNum) {
				if (myGuess > myNum) {
					System.out.println("Your value is higher than the number.");
				}	else {
					System.out.println ("Your value is lower than the number.");
				}
			}
			
		}
		System.out.println("Congratulations on figuring out the number.");
		input.close();
	}

}
