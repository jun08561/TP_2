import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp implements Reporter
{

	public static void main(String[] args)
	{
		StdOut.println("Welcome to 635 Skunk project!");
		
		StdOut.println("Play one Turn for player1");
		
		String player = "player1";
		
		Turn turn = new Turn(); 
		while(true)
			{
	    StdOut.print("Do you want to roll? n or y (Enter==>y)");
			
		String answer = StdIn.readLine();
		if (!answer.equals('n'))
		{
			turn.rollAgain();
			turn.scoreTurn();
			StdOut.println("You rolled a "+turn.getLastRoll().getDice().getLastRoll());
			if  (turn.ends())
			{
				break;
			}
	}
		else {
			StdOut.println("You declined to roll.");
			break;
		
	}
		int turnScore = turn.getTurnScore();
		StdOut.println("Your scored "+turnScore+ "fot this turn is");
	}
		
		
	}

	@Override
	public void showMessage(String msg)
	{
		StdOut.print(msg);
		
	}
}

