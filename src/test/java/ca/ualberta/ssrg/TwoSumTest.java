package ca.ualberta.ssrg;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void testSimpleGetPositions() {
		int[] nums = {2, 7, 11, 15};
		int target = 13;

		int[] positions = TwoSum.getPositions(nums, target);
		assertTrue(positions != null);
		assertTrue(positions[0] == 0 && positions[1] == 2);
	}
	
	@Test
	public void testComplexGetPositions() {
		int[] nums = {2, 7, 11, 15};
		int target = 14;

		int[] positions = TwoSum.getPositions(nums, target);
		assertTrue(positions == null);
		
		target = 26;

		positions = TwoSum.getPositions(nums, target);
		assertTrue(positions != null);
		assertTrue(positions[0] == 2 && positions[1] == 3);
	}
	
}
