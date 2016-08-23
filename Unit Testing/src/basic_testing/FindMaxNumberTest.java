package basic_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

	@Test
	public void testFindMax() {

		assertEquals(9, new FindMaxNumber().findMax(new int[] { 6, 7, 8, 9 }));
		assertEquals(9, new FindMaxNumber().findMax(new int[] { 6, 7, 8, 9, 9, 9 }));
		Assert.assertEquals(6, new FindMaxNumber().findMax(new int[] { 6 }));
		Assert.assertEquals(-9, new FindMaxNumber().findMax(new int[] { -9 }));
		Assert.assertEquals(0, new FindMaxNumber().findMax(new int[] { 0 }));

		assertEquals("Should be 1/3", 0.33, (1.0 / 3.0), 0.01);

		try {
			new FindMaxNumber().findMax(new int[] {});
		} catch (Exception e) {
			Assert.assertEquals("Empty List", e.getMessage());
		}

		assertSame(9, new FindMaxNumber().findMax(new int[] { 6, 7, 8, 9 }));

	}
}
