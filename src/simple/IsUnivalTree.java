package simple;

import bean.TreeNode;

/**
 * ���������ÿ���ڵ㶼������ͬ��ֵ����ô�ö��������ǵ�ֵ��������
 * ֻ�и��������ǵ�ֵ������ʱ���ŷ��� true�����򷵻� false��
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
