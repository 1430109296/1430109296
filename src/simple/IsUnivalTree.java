package simple;

import bean.TreeNode;

/**
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 * 
 * @author UDS
 *
 */
public class IsUnivalTree {

	public static boolean isUnivalTree(TreeNode root) {
		TreeNode left = root.left;
		TreeNode right = root.right;
		boolean lflag = true;
		boolean rflag = true;
		if (left != null) {
			if (left.val == root.val) {
				lflag = isUnivalTree(left);
			} else {
				return false;
			}
		}
		if (right != null) {
			if (right.val == root.val) {
				rflag = isUnivalTree(right);
			} else {
				return false;
			}
		}
		return rflag == lflag ? rflag : false;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(1, new TreeNode(1, null, null), null),
				new TreeNode(1, new TreeNode(1, null, null), null));
		boolean flag = isUnivalTree(root);
		System.out.println(flag);
	}
}
