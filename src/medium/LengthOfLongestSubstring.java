package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ���ַ��� s �������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
 *	����: s = "abcabcbb"
 *  ���: 3 
 *  ����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
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
