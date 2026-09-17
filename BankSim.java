package beginnerProjects;
import java.util.*;
public class BankSim {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int myChoice = 0;
		double myBalance = 100.00;
		
		do {
			System.out.println("1. View Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			myChoice = input.nextInt();
			
			switch	(myChoice) {
			
			case 1: 
				System.out.println("Your balance is " + myBalance);
			break;
			
			case 2:
				System.out.println("How much would you like to depsit?");
				double myDeposit = input.nextDouble();
				System.out.println("You deposited " + myDeposit + " to your balance.");
				myBalance = myBalance + myDeposit;
			break;
			
			case 3:
				System.out.println("How much would you like to withdraw?");
				double myWithdraw = input.nextDouble();
				System.out.println("You withdrew " + myWithdraw + " from your account.");
			break;
			
			case 4:
				System.out.println("Closing");
			break;
			}
			
			
		} while (myChoice != 4);
		
		input.close();
	}
}
