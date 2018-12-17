import java.util.ArrayList;

import org.omg.PortableServer.THREAD_POLICY_ID;

import edu.princeton.cs.introcs.StdOut;

public class Turn
{

	private int turnScore;
	private Roll lastRoll;
	private ArrayList<Roll> rollSequence;
	public Object rollAgain;
	public Turn() {
		this.turnScore = 0;
		this.lastRoll = null;
	    this.rollSequence = new ArrayList<Roll>();
	}
	public int getTurnScore()
	{
		// TODO Auto-generated method stub
		return this.turnScore;
	}
	public Roll getLastRoll()
	{
		// TODO Auto-generated method stub
		return this.lastRoll;
	}
	public void rollAgain() {
		this.lastRoll = new Roll();
		rollSequence.add(this.lastRoll);
		
	}
	
	
public void scoreTurn()
{
	if(this.getLastRoll().isDoubleSkunk()) {
		StdOut.println("You rolled a DoubleSkunk");
		turnScore = 0;
		
		
	}else if (this.getLastRoll().isDeuceSkunk()) {
		StdOut.println("You rolled a DeuceSkunk");
		turnScore = 0;
	}
	else if (this.getLastRoll().isSingleSkunk()) {
		StdOut.println("You rolled a SingleSkunk");
		turnScore = 0;
	}
	else {
		turnScore+= lastRoll.getDice().getLastRoll();
	}

}

public String getDiceValue() {
	return ":"+ lastRoll.getDiceValue();
}
public boolean ends()
{
	// TODO Auto-generated method stub
	return lastRoll.isDoubleSkunk() || lastRoll.isDeuceSkunk() || lastRoll.isSingleSkunk();
}
	
}
	

