import static org.junit.Assert.*;



import org.junit.After;

import org.junit.Before;

import org.junit.Test;



public class RoundTest

{

	private Round round;



	@Before

	public void setUp() throws Exception

	{

		this.round = new Round();

	}



	@After

	public void tearDown() throws Exception

	{

	}


	@Test

	public void testRoundScore()

	{



		int turnScore = this.round.getRoundscore();

		assertEquals("init_turn_score_not_0", turnScore, 0 );

	}

}