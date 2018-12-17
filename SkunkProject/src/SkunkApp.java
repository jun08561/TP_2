import java.util.ArrayList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;

public class SkunkApp {

	public Round round;
	public static int numberOfPlayers;
	public static String[] playerNames;

	// public ArrayList<Player> players;
	public static void main(String[] args) {

		StdOut.println("Welcome to Skunk Game!");

		StdOut.println("Do you want to read the instructions of the game? yes or no [y/n]");
		String read = StdIn.readLine();
        
		if (!read.equals("y") && !read.equals("n")) {
			StdOut.println("Incorrect input! Please enter [Y/N] and try it again!");	
		} else if (read.equals("n")) {
			StdOut.println("Game over");

		} else if (read.equals("y")) {

			StdOut.println("Game on!\r\n");

			StdOut.print("How many players? ");
			numberOfPlayers = StdIn.readInt();
			StdIn.readLine();

			int turnScore = 0;
			int roundScore = 0;
			for (int playerNumber = 0; playerNumber < numberOfPlayers; playerNumber++) {
				//
				StdOut.print("Enter name of player " + (playerNumber + 1) + ": ");
				
				Scanner reader = new Scanner(System.in);
		
				String playerNames = reader.nextLine();
				
				Turn turn = new Turn();
				Round round = new Round();
				StdOut.println("Next player is: " + playerNames);
				StdOut.println("---------------------------------------------------------------------------------");

				while (true) {
					StdOut.println("Do you want to roll? n or y (Enter==>y)");
					String answer = StdIn.readLine();
					if (!answer.equals("n")) {
						turn.rollAgain();
						turn.scoreTurn();
						StdOut.println("The number you get is: "+ turn.getDiceValue());
						StdOut.println("You rolled a " + turn.getLastRoll().getDice().getLastRoll());
						turnScore = turn.getTurnScore();
						roundScore += turnScore;
						StdOut.println("Your scored is" + turnScore + "for this turn");
						StdOut.println("Your score of this Round is: " + roundScore);
						if (turn.ends()) {
							break;
						}
					} else {
						StdOut.println("You declined to roll.");
						turnScore = turn.getTurnScore();
						// roundScore += turnScore;
						StdOut.println("Your scored is" + turnScore + " for this turn");
						StdOut.println("Your score of this Round is: " + roundScore);
						break;
					}
					//roundScore += turnScore;
					if (roundScore >= 100) {
						//StdOut.println("The value is over 100, Game Over");
						break;

					}
					
				}
				if (roundScore >= 100) {
					//StdOut.println("The value is over 100, Game Over");
					break;

				}
				
			}
        
		}
   
	}

}
