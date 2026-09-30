package intermediateProjects;
import java.util.*;
public class AdventureGame {
	public static void main(String []args) {
		String myPlayer = "Player";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello player welcome!");
		System.out.println("What is your name player?");
		String myName = input.next();
		
		int myChoice = 0;
		
		String[] inventory = new String[6];
		
		
		while (myChoice != 5) {
			
			System.out.println("1: Training");
			System.out.println("2: Shop");
			System.out.println("3: Sell");
			System.out.println("4: Inventory");
			
			
			switch (myChoice){
			
			case 1:
			break;
			
			case 2:
			break;
			
			case 3:
			break;
			
			case 4:
				System.out.println("0: ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
			break;
			
			}
		}
	}

}
