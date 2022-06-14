package medium;

public class Convert {
	/**
	 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
	 * 
	 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
	 * 
	 * P A H N A P L S I I G Y I R 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
	 * 
	 * 请你实现这个将字符串进行指定行数变换的函数：
	 * 
	 * string convert(string s, int numRows);
	 * 
	 * 来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/zigzag-conversion
	 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * 
	 * @param s
	 * @param numRows
	 * @return
	 */
	public static String convert(String s, int numRows) {
		System.out.println(s.length());
		if (numRows == 1) {
			return s;
		}
		String ns = "";
		for (int i = 0; i < numRows; i++) {
			for (int j = i, k = j + (numRows - i - 1) * 2; j < s.length()
					|| k < s.length(); j += (numRows - 1) * 2, k += (numRows - 1) * 2) {
				if (j == k || j + (numRows - 1) * 2 == k || k >= s.length()) {
					ns = ns + s.charAt(j);
				} else {
					ns = ns + s.charAt(j);
					ns = ns + s.charAt(k);
				}
			}
		}
		return ns;
	}

	public static void main(String[] args) {
		String s = "abcdefghijklmn";
		System.out.println(convert(s, 3));
	}
//	P A H N
//	APLSIIG
//	Y I R
//	a   g   m		1   8    15
//	b  fh  ln		2  79   1416
//	c e i k			3 6 10 13
//	d   j			45  1112
//			
}
