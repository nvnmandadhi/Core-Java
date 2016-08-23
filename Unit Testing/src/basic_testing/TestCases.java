package basic_testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCases {
	
	@Before
	public void setUp(){
		
	}

	@Test
	public void testAdd() {
		assertEquals(2, 1 + 1);
	}

	@Test
	public void testDiv() {
		assertEquals(1, 2 - 1);
	}
	
	@After
	public void tearDown(){
		
	}
}
