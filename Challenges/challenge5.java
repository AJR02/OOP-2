package Challenges;

import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1; // Random number between 1-10
        int guess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Guess a number between 1 and 10!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Correct! The number was " + secretNumber);
                hasGuessedCorrectly = true; // Exit loop
            } else {
                System.out.println("Wrong! Try again.");
            }
        }
    }
}