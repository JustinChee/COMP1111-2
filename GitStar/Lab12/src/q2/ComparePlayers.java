/**
 * 
 */
package q2;

import java.util.Scanner;

/**
 * Reads in two Player objects and tells whether they represent
 * the same player.
 * 
 * @author Justin
 *
 */
public class ComparePlayers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        
        Scanner scan = new Scanner(System.in);
        
        // Prompts for and read in information for player 1
        player1.readPlayer();
        
        // Prompts for and read in information for player 2
        player2.readPlayer();
        
        // Compare player 1 to player 2 and print a message saying
        // whether they are equal
        if (player1.equals(player2)){
            System.out.println("Same player");
        } else {
            System.out.println("Different players");
        }

    }

}
