import java.util.Arrays;

class Question416 {
	public static void main(String[] args) {
		int[] nums = {1,5,11,5};
		System.out.println(canPartition(nums));
	}
	
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
			sum += i;
		}
        Arrays.sort(nums);
        if((sum & 1) == 1)
        	return false;
        else {
        	return check(nums, nums.length - 1, 0, 0, sum / 2);
        }
    }
    
    public static boolean check(int[] nums, int index, 
    		int sum1, int sum2, int target) {
    	if(sum1 > target || sum2 > target)
    		return false;
    	if(sum1 == target || sum2 == target)
    		return true;

    	return check(nums, index - 1, sum1 + nums[index], sum2, target)
    		|| check(nums, index - 1, sum1, sum2 + nums[index], target);
    }
}
