import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void Strike(){
		Frame frame = new Frame(10, 0);
		assertTrue(frame.isStrike());
	}

}
