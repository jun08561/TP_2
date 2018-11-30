import java.util.ArrayList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;

public class SkunkApp {

	public Round round;
	public static int numberOfPlayers;
	public static String[] playerNames;
	//public ArrayList<Player> players;
	public static void main(String[] args)
	{
	    
		StdOut.println("Welcome to Skunk Game!");
		
		StdOut.println("Do you want to read the instructions of the game? [Y/N]"); 
		String read = StdIn.readLine();	
		while(!read.equalsIgnoreCase("y") && !read.equalsIgnoreCase("n"))
		{ 
		StdOut.println("Incorrect input! Please enter [Y/N]."); 
		read = StdIn.readLine(); 
		
		} 
		if(read.equalsIgnoreCase("y")) 
		{
		StdOut.println("The object of the game is to accumulate a score of 100 points or more. A score is made by rolling the dice and combining the points on the two dice.\r\n"
					+ "For example: A 4 and 5 would be 9 points - if the player decides to take another roll of the dice and turns up a 3 and 5 (8 points), he would then have an \r\n"
					+ "accumulated total of 17 points for the two rolls. The player has the privilege of continStdOut.ng to shake to increase his score or of passing the dice to wait\r\n"
					+ "for the next series, thus preventing the possibility of rolling a Skunk and losing his score.\r\n" + 
					"\r\n" + "PENALTIES:\r\n" + "\r\n" + "* A skunk in any series voids the score for that series only and draws a penalty of 1 chip placed in the \"kitty,\" and loss of dice.\r\n" + 
					"\r\n" + "* A skunk and a deuce voids the score for that series only and draws a penalty of 2 chips placed in the \"kitty,\" and loss of dice.\r\n" + 
					"\r\n" + "* TWO skunks void the ENTIRE accumulated score and draws a penalty of 4 chips placed in the \"kitty,\" and loss of dice. Player must again start to score from scratch.\r\n" + 
					"\r\n" + "* Any number can play. The suggested number of chips to start is 50. There are sufficient chips in the box to allow 8 players to start with 50 chips by \r\n"
							+ "placing a par value of \"one\" on white chips, 5 for 1 on red chips and 10 for 1 on the blue chips.\r\n" + 
					"\r\n" + "The first player to accumulate a total of 100 or more points can continue to score as many points over 100 as he believes is needed to win. When he decides to stop, \r\n"
							+ "his total score is the \"goal.\" Each succeeding player receives one more chance to better the goal and end the game.\r\n" + 
					"\r\n" + "The winner of each game collects all chips in \"kitty\" and in addition five chips from each losing player or 10 chips from any player without a score..\r\n");

			StdOut.println("Game on!\r\n");
		
				StdOut.print("How many players? ");
				numberOfPlayers = StdIn.readInt();
			

				boolean gamestart = true;
		       int turnScore =0;
		       int roundScore = 0;
	 	
	for(int playerNumber=0; playerNumber<numberOfPlayers; playerNumber++) {
			
//			
		    StdOut.print("Enter name of player " + (playerNumber + 1) + ": ");
		    Scanner reader =  new Scanner(System.in);
			String playerNames = reader.nextLine();
			Turn turn = new Turn(); 
			Round round = new Round();
		    StdOut.println("Next player is: "+playerNames);
		
			while(true) {
			StdOut.println("Do you want to roll? n or y (Enter==>y)");	
			String answer = StdIn.readLine();
			if (!answer.equals("n"))
			{
			   turn.rollAgain();
			   turn.scoreTurn();
			   StdOut.println("You rolled a "+turn.getLastRoll().getDice().getLastRoll());
			   turnScore = turn.getTurnScore();
			   StdOut.println("Your score is"+turnScore+ "for this turn");	
				if (turn.ends())
				{
					break;
				}
				if(turnScore>=100) {
					break;
			}
			    }else {
				StdOut.println("You declined to roll.");
				break;			
			     }
			roundScore += turnScore;
		//	StdOut.println("Your score of this Round is: "+roundScore);
			if(roundScore>=100) {
				gamestart=false;
	
			}
			//StdOut.println("Your score of this Round is: "+roundScore);
		}
			if(roundScore>=100) {
				break;
		
			}
			StdOut.println("Your score of this Round is: "+roundScore);
		
			}
	
	//}

	}
			
				
		
	}
		
}
