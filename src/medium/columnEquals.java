package medium;


public class columnEquals {

	public int ceq(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i]>nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		int midel = nums.length%2==0?(nums[(nums.length/2)-1]+nums[nums.length/2])/2:nums[nums.length/2];
		int count = 0;
		for (int i : nums) {
			count = count + Math.abs(midel-i);
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,10,2,9};
		columnEquals ceq = new columnEquals();
		System.out.println(ceq.ceq(nums));
	}
}
