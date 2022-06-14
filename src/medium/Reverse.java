package medium;


public class Reverse {

	/**
	 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
	 * 
	 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
	 * 
	 * 来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/reverse-integer
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 */
	
	public static int reverse(int x) {
//		Long lmax = Long.valueOf(x);
//		String nstr = "";
//		String numstr = String.valueOf(Math.abs(lmax));
//		for (int i = numstr.length()-1; i >= 0; i--) {
//			nstr += numstr.charAt(i);
//		}
//		lmax = Long.valueOf(nstr);
//		int max = (int) Math.pow(2, 31);
//		if (-max> lmax || lmax> max) {
//			return 0;
//		}
//		if (x<0) {
//			return -Integer.valueOf(nstr);
//		}
//		return Integer.valueOf(nstr);
		long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;

    }
	
	public static void main(String[] args) {
		int x = 123;
		System.out.println(reverse(x));
	}
}
