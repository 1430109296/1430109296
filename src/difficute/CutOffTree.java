package difficute;

import java.util.List;

/**
 * 你被请来给一个要举办高尔夫比赛的树林砍树。树林由一个 m x n 的矩阵表示， 在这个矩阵中：
 * 
 * 0 表示障碍，无法触碰 1 表示地面，可以行走 比 1 大的数 表示有树的单元格，可以行走，数值表示树的高度
 * 每一步，你都可以向上、下、左、右四个方向之一移动一个单位，如果你站的地方有一棵树，那么你可以决定是否要砍倒它。
 * 
 * 你需要按照树的高度从低向高砍掉所有的树，每砍过一颗树，该单元格的值变为 1（即变为地面）。
 * 
 * 你将从 (0, 0) 点开始工作，返回你砍完所有树需要走的最小步数。 如果你无法砍完所有的树，返回 -1 。
 * 
 * 可以保证的是，没有两棵树的高度是相同的，并且你至少需要砍倒一棵树。
 * 
 *  
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/cut-off-trees-for-golf-event
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author UDS
 *做不出来
 */
public class CutOffTree {

	public int cutOffTree(List<List<Integer>> forest) {
		int[] index = new int[forest.size()];
		for (int i = 0; i < index.length; i++) {
			index[i] = -1;
		}

		for (int i = 0; i < forest.size(); i++) {

		}
		return 0;

	}
}
