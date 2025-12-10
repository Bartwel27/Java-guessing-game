import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// Guess game
		System.out.println("** Welcome to Guess the Number **");
		
		System.out.print("What's your name: ");
		Scanner initUser = new Scanner(System.in);
		String user = initUser.nextLine();
		
		System.out.println("\n* Hello "+user+". *\n");
		System.out.println("What would you like to do?\n1. start game\n2. continue game\n3. exit game");
		System.out.print("enter option: ");
		
		Scanner initOp = new Scanner(System.in);
		int op = initOp.nextInt();
		if (op == 1) {
			// start
			boolean isGameOn = true;	
			int start = 0;
			int limit = 5;
			while (isGameOn) {
				start++;
				System.out.print("guess a lower or higher number: ");
				Scanner initGuess = new Scanner(System.in);
				int guess = initGuess.nextInt();
				
				Random initRand = new Random();
				int rand = initRand.nextInt(10) + 1;
				
				if (guess == rand) {
					System.out.println("[+] Congratulation "+user+", you won. [+]");
					break;
				} else {
					System.out.println("wrong guess, you guessed "+start+"/"+limit);
					if (start == 5) {
						System.out.println("Game over, You have reached your guess limit.");
						break;	
					} else {
						continue;
					}
				}
			}
		} else if(op == 2) {
			// continue
			System.out.println("Ooops too soon!");
		} else if(op == 3) {
			// exit
			System.out.println("Good bye!");
		} else {
			System.out.println("Invalid option!");
		}
	}
}