package beginnerProjects;

import java.util.*;
public class GradeEvaluator {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		double myGrade = input.nextDouble();
		
		if (myGrade >= 0 && myGrade <= 100) {
			if (myGrade >= 97) {
				System.out.println("Your grade is A+");
			}	else if (myGrade >= 93) {
				System.out.println("Your grade is A");
			}	else if (myGrade >= 90) {
				System.out.println("Your grade is A-");
			}	else if (myGrade >= 87) {
				System.out.println("Your grade is B+");
			}	else if (myGrade >= 83) {
				System.out.println("Your grade is B");
			}	else if (myGrade >= 80) {
				System.out.println("Your grade is B-");
			}	else if (myGrade >= 77) {
				System.out.println("Your grade is C+");
			}	else if (myGrade >= 73) {
				System.out.println("Your grade is C");
			}	else if (myGrade >= 70) {
				System.out.println("Your grade is C-");
			}	else if (myGrade >= 67) {
				System.out.println("Your grade is D+");
			}	else if (myGrade >= 63) {
				System.out.println("Your grade is D");
			}	else if (myGrade >= 60) {
				System.out.println("Your grade is D-");
			}	else {
				System.out.println("Your grade is F");
			}
		}	else {
			System.out.println("Invalid number");
		}
		
	}

}
