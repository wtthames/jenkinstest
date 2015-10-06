package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTestTest {

	@Test
	public void testMultiply() {
		junit test = new junit();
		int result = test.multiply(5, 100);
		assertEquals(500, result);
		
	}

}
