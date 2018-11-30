import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoundTest {

	@Before
	public void setUp() throws Exception
	{
		
	}
	@Test
	public void create_new_test() {
		Round new_round = new Round();

	}
	@Test
	public void round_score_0_in_new_round()
	{
		Round new_round = new Round();
		assertEquals("init_round_score_not_0", 0, new_round.getRoundscore());
		

	}

}
