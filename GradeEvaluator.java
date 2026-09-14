package beginnerProjects;
import java.util.*;
public class GradeEvaluator {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		double myGrade = input.nextDouble();
		
		if (myGrade >= 90) {
			System.out.println("Your grade is A");
		}	else if (myGrade >= 80) {
			System.out.println("Your grade is B");
		}	else if (myGrade >= 70) {
			System.out.println("Your grade is C");
		}	else if (myGrade >= 60) {
			System.out.println("Your grade is D");
		}	else {
			System.out.println("Your grade is F");
		}
		
	}

}
