package medium;

/**
 * 给你一个区间数组 intervals ，其中 intervals[i] = [starti, endi] ，且每个 starti 都 不同 。
 * 
 * 区间 i 的 右侧区间 可以记作区间 j ，并满足 startj >= endi ，且 startj 最小化 。
 * 
 * 返回一个由每个区间 i 的 右侧区间 的最小起始位置组成的数组。如果某个区间 i 不存在对应的 右侧区间 ，则下标 i 处的值设为 -1 。
 * 
 *   示例 1：
 * 
 * 输入：intervals = [[1,2]] 输出：[-1] 解释：集合中只有一个区间，所以输出-1。
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/find-right-interval
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author UDS
 *
 */
public class FindRightInterval {

	public static int[] findRightInterval(int[][] intervals) {
		int min = 0;
		int[] num = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			int[] start = intervals[i];
			num[i] = -1;
			boolean flag = true;
			for (int j = 0; j < intervals.length; j++) {
				if (start[1] <= intervals[j][0]) {
					if (flag) {
						min = intervals[j][0];
						num[i] = j;
						flag = false;
					}
					if (min > intervals[j][0]) {
						min = intervals[j][0];
						num[i] = j;
					}
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int[][] intervals = new int[][] { {1,2},{2,3},{0,1},{3,4}};
		findRightInterval(intervals);
	}
}
