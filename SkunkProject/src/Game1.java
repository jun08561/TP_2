import java.util.ArrayList;

import edu.princeton.cs.introcs.StdIn;


public class Game1 implements Reporter
{
	public UI ui;
	public int numberOfPlayers;
	public String[] playerNames;
	public ArrayList<Player> players;
	
	public Round round;
	
	
	public boolean wantsToQuit;
	public boolean oneMoreRoll;
 
	public  boolean run() {

		ui.print("How many players? ");
		numberOfPlayers = StdIn.readInt();
		
		for (int playerNumber = 0; playerNumber < numberOfPlayers; playerNumber++)
		{
			ui.print("Enter name of player " + (playerNumber + 1) + ": ");
			playerNames[playerNumber] = StdIn.readLine();
			
		}
	
        ui.println("Next player is: "+playerNames);
        boolean gamestart = true; 
        int turnScore =0;
        int roundScore = 0;
       while(numberOfPlayers!=0) {
	while(gamestart) {
		Turn turn = new Turn(); 
		Round round = new Round();
	    ui.println("Next player is: "+playerNames);
	    ui.println("Do you want to roll? n or y (Enter==>y)");	
		String answer = StdIn.readLine();
		if (!answer.equals("n"))
		{
			turn.rollAgain();
			turn.scoreTurn();
			ui.println("You rolled a "+turn.getLastRoll().getDice().getLastRoll());
			 turnScore = turn.getTurnScore();
			 roundScore += turnScore;
			ui.println("Your scored is"+turnScore+ "for this turn");	
			ui.println("Your score of this Round is: "+roundScore);
			if (turn.ends())
			{
				break;
			}
	     }else {
			ui.println("You declined to roll.");
			turnScore = turn.getTurnScore();
			roundScore += turnScore;
			ui.println("Your scored is"+turnScore+ " for this turn");
			ui.println("Your score of this Round is: "+roundScore);
			break;			
	     }
		if(roundScore>=100) {
			gamestart =false;
		}
		
	}
	numberOfPlayers--;
   	
		
       }
		return true;
		
		
	}
	
		
		

		
	
	
	
	@Override
	public void showMessage(String msg)
	{
		ui.print(msg);
		
	}
}

