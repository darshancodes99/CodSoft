import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 10;  
        int score = 0;         
        boolean playAgain = true;

        while(playAgain) {
            int randomNumber = random.nextInt(100) + 1; 
            int attempts = 0;
            boolean guessCorrect = false;

            System.out.println("I have generated a number between 1 and 100. Can you guess it?");

            while(attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if(userGuess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the number correctly.");
                    guessCorrect = true;
                    score++;
                    break;
                } else if(userGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
            }

            if(!guessCorrect) {
                System.out.println("You've used all your attempts. The correct number was " + randomNumber + ".");
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
            System.out.println();
        } 

        System.out.println("Thank you for playing! Your final score is: " + score);
        scanner.close();
    }
}
