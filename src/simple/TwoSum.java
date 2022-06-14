package simple;


public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int i=0,j=0;
		for (i = 0; i < nums.length-1; i++) {
			
			for (j = i+1; j < nums.length; j++) {
				if (nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {i,j};
    }
	
	public static void main(String[] args) {
		for (int i : twoSum( new int[] {-1,-2,-3,-4,-5}, -8)) {
			System.out.println(i);
		}
	}
}
