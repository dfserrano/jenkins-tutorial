package ca.ualberta.ssrg;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

	@Test
	public void test() {
		int[] nums = {2, 7, 11, 15};
		int target = 9;

		int[] positions = TwoSum.getPositions(nums, target);
		assertTrue(positions[0] == 0 && positions[1] == 1);
	}

}
