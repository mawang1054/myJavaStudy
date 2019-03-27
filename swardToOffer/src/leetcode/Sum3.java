package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Sum3 {
	@Test
	public void test() {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));
	}
	
	  public List<List<Integer>> threeSum1(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> ls = new ArrayList<>();
	 
	        for (int i = 0; i < nums.length - 2; i++) {
	            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {  // 跳过可能重复的答案
	 
	                int l = i + 1, r = nums.length - 1, sum = 0 - nums[i];
	                while (l < r) {
	                    if (nums[l] + nums[r] == sum) {
	                        ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
	                        while (l < r && nums[l] == nums[l + 1]) l++;
	                        while (l < r && nums[r] == nums[r - 1]) r--;
	                        l++;
	                        r--;
	                    } else if (nums[l] + nums[r] < sum) {
	                        while (l < r && nums[l] == nums[l + 1]) l++;   // 跳过重复值
	                        l++;
	                    } else {
	                        while (l < r && nums[r] == nums[r - 1]) r--;
	                        r--;
	                    }
	                }
	            }
	        }
	        return ls;
	    }
	
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; ++i) {
        	if(i == 0 || nums[i] != nums[i - 1]) {
	        	int j = i + 1;
	        	int z = nums.length - 1;
	        	int sum = 0 - nums[i];
	        	
	        	while(j < z) {
	        		if(nums[j] + nums[z] == sum) {
	        			lists.add(Arrays.asList(nums[i],nums[j],nums[z]));
	        			while(j < z && nums[j] == nums[j + 1])
	        				++j;
	        			while(j < z && nums[z] == nums[z - 1])
	        				--z;
	        			++j;
	        			--z;
	        		} else if(nums[j] + nums[z] < sum) {
	        			while(j < z && nums[j] == nums[j + 1])
	        				++j;
	        			++j;
	        		} else {
	        			while(j < z && nums[z] == nums[z - 1])
	        				--z;
	        			--z;
	        		}
	        	}
        	}
        }
        return lists;
    }
}
