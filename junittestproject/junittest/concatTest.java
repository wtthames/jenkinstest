package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatTest {

	@Test
	public void testConcat() {
		junit test = new junit();
		String result = test.concatenate("hi","mom");
		assertEquals("hi mom", result);
	}

}
