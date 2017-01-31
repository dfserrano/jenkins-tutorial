package ca.ualberta.ssrg;

import java.util.Hashtable;

public class TwoSum {

	public static int[] getPositions(int[] nums, int target) {

		Hashtable<Integer, Integer> mem = new Hashtable<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (mem.containsKey(target - nums[i])) {
				int[] result = { mem.get(target - nums[i]), i };
				return result;
			}
			
			mem.put(nums[i], i);
		}

		return null;
	}

	public static void main(String... args) {
		if (args != null && args.length == 2) {

			String[] pieces = args[0].split(",");
			int[] nums = new int[pieces.length];

			for (int i = 0; i < pieces.length; i++) {
				nums[i] = Integer.parseInt(pieces[i]);
			}

			int target = Integer.parseInt(args[1]);

			int[] result = getPositions(nums, target);

			if (result != null) {
				System.out.println("The positions are: " + result[0] + " and " + result[1]);
			} else {
				System.out.println("An error has occurred");
			}
		} else {
			System.out.println("Usage: TwoSum <array of comma separated integers> <target>\nExample: TwoSum 1,2,3 5");
		}
	}

}
