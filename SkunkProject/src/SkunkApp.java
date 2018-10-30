import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp implements Reporter
{

	public static void main(String[] args)
	{
		StdOut.println("Welcome to 635 Skunk project!");
		StdOut.print("please enter your name: ");
		
		String player = StdIn.readLine();
		StdOut.println("Play one Turn for" + player);
//		
	    Turn turn = new Turn(); 
		while(true)
	{
	    StdOut.print("Do you want to roll? n or y (Enter==>y)");
			
		String answer = StdIn.readLine();
		if (!answer.equals("n"))
		{
			turn.rollAgain();
			turn.scoreTurn();
			StdOut.println("You rolled a "+turn.getLastRoll().getDice().getLastRoll());//+"with sum of"+ turn.getLastRoll().getDice().getLastRoll())
			int turnScore = turn.getTurnScore();
			StdOut.println("Your scored is"+turnScore+ "for this turn");			
			if (turn.ends())
			{
				break;
			}
	     }else {
			StdOut.println("You declined to roll.");
			int turnScore = turn.getTurnScore();
			StdOut.println("Your scored is"+turnScore+ " for this turn");
			break;
			}

	}
	
	}

	@Override
	public void showMessage(String msg)
	{
		StdOut.print(msg);
		
	}
}

