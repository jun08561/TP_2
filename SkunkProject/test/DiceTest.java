import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

import edu.princeton.cs.introcs.StdOut;

public class DiceTest
{
	private Die die;

	@Before
	public void setUp() throws Exception
	{
		int[] init_values = new int[]
		{ 3, 2, 1 };
		die = new Die(init_values);
	//	StdOut.println("setUp() called");

	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test_initialization_of_predictable_die()
	{
		die.roll();
		int value = die.getLastRoll();

		assertEquals("first value not 3", 3, value);

	}

	@Test
	public void test_roll_2_of_predictable_die()
	{
		die.roll();
		assertEquals("first value not 3", 3, die.getLastRoll());
		die.roll();
		assertEquals("second value not 2", 2, die.getLastRoll());
	}
   
	@Test
	//this is the one successful dice test
	public void test_dice() {
		
	    int[] init_values =new int[] {6,7,8};
	    Die die2 = new Die(init_values);
	    int[] init_values1 =new int[] {3,2,1};
	    Die die = new Die(init_values1);
	    Dice dice= new Dice(die, die2);
		dice.roll();
		int result = dice.getLastRoll();
		assertEquals(9, result);
		
	}
	


}
