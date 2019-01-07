package twosum;

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = new int[] {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum_1(nums,target)));
		System.out.println(Arrays.toString(twoSum_2(nums,target)));
	}
	
	public static int[] twoSum_1(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static int[] twoSum_2(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) 
	        	return new int[] { i, map.get(complement) };
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
