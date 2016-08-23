/**
 * 
 */
package basic_testing.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import basic_testing.StringReverse;
import basic_testing.StringReverseImpl;

/**
 * @author Naveen
 *
 */

public class StringReverseImplTest {

    private StringReverse obj;

    @Before
    public void setup() {
	obj = new StringReverseImpl();
    }

    /**
     * Test method for
     * {@link basic_testing.StringReverseImpl#ReverseString(java.lang.String)}.
     */
    @Test
    public void testReverseStringMethod() {
	obj = new StringReverseImpl();
	String result = obj.ReverseString("Hello");
	assertNotNull(result);
	assertEquals("olleH", result);
    }

    @Test(expected = IllegalStateException.class)
    public void testShouldThrowError() {
	obj = new StringReverseImpl();
	obj.ReverseString("");
    }
}
