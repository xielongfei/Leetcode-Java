package leetcode.LongestPalindromicSubstring_0005;

/**
 * @author: xielongfei
 * @date: 2021/01/15 14:27
 * @description: 最长回文子串
 * @version: 2.5
 */
public class L0005_1 {


    /***
     * 暴力解法，超出时间限制
     * @param s
     * @return
     */
    public  static String longestPalindrome(String s) {
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            int right = s.length();
            while (i < right -1) {
                String t = s.substring(i, right);
                if (valid(t,0, t.length() -1) && t.length() > res.length()){
                    res = t;
                    break;
                }
                right--;
            }
        }
        return res;
    }

    private static boolean valid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
