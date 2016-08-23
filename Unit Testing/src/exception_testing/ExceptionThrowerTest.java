package exception_testing;

import org.junit.Test;

public class ExceptionThrowerTest {

	@Test(expected = RuntimeException.class)
	public void testInvokeMe() {
		new ExceptionThrower().invokeMe();
	}

}
