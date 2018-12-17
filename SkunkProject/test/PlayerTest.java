import static org.junit.Assert.*;



import org.junit.After;

import org.junit.Before;

import org.junit.Test;



public class PlayerTest

{



	private Player player;

	

	@Before

	public void setUp() throws Exception

	{

		this.player = new Player(null);

	}



	@After

	public void tearDown() throws Exception

	{

	}

	

	@Test

	public void test_createPlayer()

	{



		this.player = new Player("Test Player Name");



		String TestPlayerName = this.player.getPlayername();



		assertEquals("Player's name is not Test Player Name", TestPlayerName, "Test Player Name");

	}

	

	@Test

	public void test_playerName()

	{

		String TestPlayerName = "Test Player Name";



		this.player.setPlayername(TestPlayerName);

		

		String playerName = this.player.getPlayername();



		assertEquals("Player's name is not Test Player Name", playerName, "Test Player Name");

	}
}
