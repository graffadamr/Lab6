import java.util.Random;
import java.util.Scanner;

/*
 * @author : Adam Graff
 */

public class Lab6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String contQuest;

		System.out.println("Welcome to the Grand Circus Casino!");

		do {
			System.out.println();
			System.out.print("How many sides should each die have? ");
			int userInput = scan.nextInt();
			
			System.out.println();
			System.out.println("Roll!");
			System.out.println(generateRandomDieRoll(userInput));
			System.out.println(generateRandomDieRoll(userInput));
			System.out.println();
			System.out.print("Roll again? (y/n) ");
			contQuest = scan.next();

		} while (!contQuest.equalsIgnoreCase("N"));
		System.out.println();
		System.out.println("Goodbye!");

		scan.close();
	}

	public static int generateRandomDieRoll(int userInput) {
		Random rand = new Random();
		int x = rand.nextInt(userInput);
		return x + 1;
	}

}
