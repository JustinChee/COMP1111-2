package q2;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>A program that plays "Hi-Lo" with the user. It takes a random value
 * and prompts the user to guess the value. The program will return whether
 * the guess is too high or too low, and asks the user to play again after 
 * quitting the game or guessing correctly.</p>
 *
 * @author Justin Chee, 1B
 * @version 1.0
 */
public class Guess {
    /**
     * <p>Generates a random number and prompts user for a guess. The guess
     * will be evaluated and return whether it's too high or too low.</p>
     *
     * @param args unused.
     * @throws IllegalArgumentException if guess is not an integer
     */
    public static void main(String[] args) {
        // Variables that are needed to play the game
        int guess;
        int numOfGuess;
        int numToGuess;
        boolean isPlaying;
        
        // The max number that the program can generate
        final int maxNum = 100;
        
        // Key that exits the high-low program.
        final int terminator = 0;
        
        Scanner scan = new Scanner(System.in);
        Random randomGenerator = new Random();

        numOfGuess = 0;
        isPlaying = true;
        numToGuess = randomGenerator.nextInt(maxNum + 1);
        
        System.out.println("Let's play Hi-Lo!");
        guess = maxNum + 1;
        
        // Loop that plays Hi-Lo until user guesses correctly or
        // exits using the terminator.
        while (isPlaying) {
            do {
                System.out.print("\n---\nGuess an integer from 1-100 "
                        + "[0 to exit]: ");
                
                // Evaluates whether input is valid
                if (!scan.hasNextInt()) {
                    throw new IllegalArgumentException(
                            "Guess is not an integer.");
                }
                guess = scan.nextInt();
                numOfGuess++;
                
                // Determines whether answer is within range
                if (guess < 0 || guess > maxNum) {
                    System.out.println("---\nDo all humans have troubles"
                            + " reading?\nI said guess an integer from"
                            + " 1-100.\n");
                }
                
                // Evaluates input and responds accordingly
                if (guess == 0) {
                    // Ends the loop.
                    guess = guess;
                } else if (guess > numToGuess) {
                    System.out.print("Too high!");
                } else if (guess < numToGuess) {
                    System.out.print("Too low!");
                } else {
                    System.out.println("Correct!\nIt took you: " + numOfGuess
                            + " guesses\n---");
                }
            } while (guess != terminator && guess != numToGuess);

            isPlaying = continuePlaying();
            numToGuess = randomGenerator.nextInt(maxNum + 1);
            numOfGuess = 0;
        }
        
        // Ending remarks
        System.out.print("---\nI hope you had fun, I sure did!...\n"
                + "Or at least I would if I was programmed to feel.\n"
                + "Please come play again in the future! ");
    }
    
    /**
     * <p>Asks whether player would like to continue playing or not.</p>
     * @return whether the player wants to continue playing.
     */
    private static boolean continuePlaying() {
        String input;
        Scanner scan = new Scanner(System.in);
        
        // Loop that continues to ask user if he'd like to player again
        // until "Y" or "N" is entered.
        do {
            System.out.print("Would you like to play again? [Y/N]: ");
            input = scan.next();
            
            if (input.equalsIgnoreCase("y")) {
                return true;
            } else if (input.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Invalid input, please re-try.");
            }
        } while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));
        
        return false;
    }
}
