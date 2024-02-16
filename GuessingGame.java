package codesoft;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	private static int Wins;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********Welcome********");
		System.out.println("Enter your name");
		String user = scanner.nextLine();
		System.out.println("Hi " + user);
		int option;
		boolean running = true;
		Wins = 0;
		do {

			System.out.println("\nPlease Enter your choice\n1.Start \n2.Quit");
			option = scanner.nextInt();
			switch (option) {
			case 1: {
				game(scanner, running);
				System.out.println("\nWould you like to play again?: \n1.yes \n2.No");
				String opt = scanner.next();
				while (opt.equals("1")) {
					game(scanner, running);
					System.out.println("\nWould you like to play again?: \n1.yes \n2.No");
					opt = scanner.next();
				}

				System.out.println("**********congratulations**********");
				running = false;
				break;
			}
			case 2: {
				System.out.println("Thank you, see you again");
				running = false;
				break;
			}

			default:
				System.out.println("Wrong Input");
				break;
			}

		} while (running);

	}

	private static void game(Scanner scanner, boolean running) {
		Random r = new Random();

		int val = r.nextInt(101);
		System.out.println("Lets begin");
		int chance = 5;
		int guess;
		while (chance > 0) {
			System.out.println("Turns left " + chance);
			System.out.println("Enter your guess");
			guess = scanner.nextInt();

			if (guess > val) {
				System.out.println("Enter lower value");
			} else if (guess < val) {
				System.out.println("Enter higher value");

			} else {
				System.out.println("**********congratulations**********");
				Wins++;
				running = false;
				break;

			}
			chance -= 1;

		}
		if (running) {

			System.out.println("Game over-you loose");
			running = false;
		}

	}

}
