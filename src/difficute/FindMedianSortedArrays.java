package difficute;

public class FindMedianSortedArrays {
	/**
	 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
	 * 
	 * 算法的时间复杂度应该为 O(log (m+n)) 。
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] sum = new int[nums1.length + nums2.length];
		int i = 0, j = 0;
		for (int l = 0; l < sum.length; l++) {
			if (i >= nums1.length) {
				sum[l] = nums2[j++];
				continue;
			}
			if (j >= nums2.length) {
				sum[l] = nums1[i++];
				continue;
			}
			if (nums1[i] <= nums2[j]) {
				sum[l] = nums1[i++];
			} else {
				sum[l] = nums2[j++];
			}
		}
		return sum.length%2 == 0?(double)(sum[sum.length/2-1]+sum[sum.length/2])/2:(double)sum[sum.length/2];
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] {1,2};
		int[] nums2 = new int[] {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
