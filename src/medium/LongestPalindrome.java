package medium;


public class LongestPalindrome {

	/**
	 * 给你一个字符串 s，找到 s 中最长的回文子串。
	 */
	
	public static String longestPalindrome(String s) {
		if (s.length() == 1) {
			return s;
		}
		int start = 0,end = s.length()-1,len = 0;
		int[] index = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			start = i;
			end = s.length()-1;
			int count = 0;
			while (start < end) {
				if (s.charAt(start) == s.charAt(end)) {
					len++;
					start++;
					end--;
				}else {
					if (start == i) {
						end--;
					}else {
						end = end + (start-i)-1;
						start = i;
						len = 0;
					}
				}
				if (start == end) {
					count = 1;
				}
			}	
			index[i] = len*2+count;
			len = 0;
		}
		int max = -1,num = 0;
		for (int i = 0; i < index.length; i++) {
			if (index[i] > max) {
				max = index[i];
				num = i;
			}
		}
		s = s.substring(num, num+index[num]);		
		return s;

    }
	
	public static void main(String[] args) {
		String s = "xaabacxcabaaxcabaax";
		String str = longestPalindrome(s);
		System.out.println(str);
	}
}
