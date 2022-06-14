package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *	输入: s = "abcabcbb"
 *  输出: 3 
 *  解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * @author UDS
 *
 */
public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		String str = "abcabcbb";
		int count = lengthOfLongestSubstring(str);
		System.out.println(count);
	}

	public static int lengthOfLongestSubstring(String s) {
		int max = 0;
		List<Character> childList = new ArrayList<>();
		s:for (int i = 0; i < s.length(); i++) {
			char index = s.charAt(i);
			for (Character character : childList) {
				if (index == character) {
					i = i-childList.size();
					childList = new ArrayList<>();
					continue s;
				}
			}
			childList.add(index);
			if (childList.size() > max) {
				max = childList.size();
			}
		}
		return max;
    }
}
