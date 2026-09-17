package beginnerProjects;
import java.util.Random;
public class Magic8Ball {
	public static void main (String []args) {
		Random roller = new Random();
		int randomNum = roller.nextInt(8);
		
		System.out.println("The Magic 8 ball says...");
		
		switch (randomNum) {
		
		case 0:
			System.out.println("Signs point to yes.");
		break;
		
		case 1:
			System.out.println("Without a doubt!");
			break;
		case 2:
			System.out.println("As I see it yes.");
			break;
		case 3:
			System.out.println("Ask again later.");
			break;
		case 4:
			System.out.println("Better not tell you now.");
			break;
		case 5:
			System.out.println("My sources say no.");
			break;
		case 6:
			System.out.println("Very doubtful.");
			break;
		case 7: 
			System.out.println("Outlook is not so good.");
			break;
		default:
			System.out.println("The crystal ball is broken.");
			
		}
	}

}
