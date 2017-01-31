package ca.ualberta.ssrg;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void testSimpleGetPositions() {
		int[] nums = {2, 7, 11, 15};
		int target = 9;

		int[] positions = TwoSum.getPositions(nums, target);
		assertTrue(positions != null);
		assertTrue(positions[0] == 0 && positions[1] == 1);
	}

}
