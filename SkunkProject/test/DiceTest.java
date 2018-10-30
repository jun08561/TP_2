import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.validator.PublicClassValidator;

import edu.princeton.cs.introcs.StdOut;

public class DiceTest
{
	//private Die die;
	private Dice test_dice;

	@Before
	public void setUp() throws Exception
	{
//		int[] init_values = new int[]
//		{ 3, 2, 1 };
//		die = new Die(init_values);
	//	StdOut.println("setUp() called");
		test_dice = new Dice();
		test_dice.roll();

	}
	private void setDice(int[] intA1, int[] intA2)
	{
		Die die1 = new Die(intA1);
		Die die2 = new Die(intA2);
		test_dice = new Dice(die1, die2);
		test_dice.roll();
	}
	@Test
	public void test_dice_double_skunk() {
		setDice(new int[] {1, 2,3},
				new int[] {1,2,3});
		assertEquals(2, test_dice.getLastRoll());
		assertTrue(test_dice.isDoubleSkunk());
	}
	
	@Test
	public void test_dice_deuce_skunk() {
		setDice(new int[] {2,2,2},
				new int[] {1,2,2});
		assertTrue(test_dice.isDeuceSkunk());
	}
	@Test
	public void test_dice_single_skunk() {
		setDice(new int[] {5,2,2},
				new int[] {1,2,2});
		assertTrue(test_dice.isSingleSkunk());
	}
 
	@After
	public void tearDown() throws Exception
	{
	}

//	@Test
////	public void test_initialization_of_predictable_die()
////	{
////		die.roll();
////		int value = die.getLastRoll();
////
////		assertEquals("first value not 3", 3, value);
////
//	}
//
//	@Test
//	public void test_roll_2_of_predictable_die()
//	{
//		die.roll();
//		assertEquals("first value not 3", 3, die.getLastRoll());
//		die.roll();
//		assertEquals("second value not 2", 2, die.getLastRoll());
//	}
//   
//	@Test
//	//this is the one successful dice test
//	public void test_dice() {
//		
//	    int[] init_values =new int[] {6,7,8};
//	    Die die2 = new Die(init_values);
//	    int[] init_values1 =new int[] {3,2,1};
//	    Die die = new Die(init_values1);
//	    Dice dice= new Dice(die, die2);
//		dice.roll();
//		int result = dice.getLastRoll();
//		assertEquals(9, result);
//		
//	}
//	
	
	


}
