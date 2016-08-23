package basic_testing;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestComposite extends TestCase {

	public TestComposite(String method) {
		super(method);
	}

	public void testAdd() {
		assertEquals(2, 1 + 1);
	}

	public void testSub() {
		assertEquals(1, 2 - 2);
	}

	public void testDiv() {
		assertEquals(2, 4 / 2);
	}

	public static TestSuite suite() {
		TestSuite suite = new TestSuite();

		suite.addTest(new TestComposite("testAdd"));
		suite.addTest(new TestComposite("testDiv"));
		suite.addTest(new TestComposite("testSub"));

		return suite;
	}
}
