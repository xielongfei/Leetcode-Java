package leetcode.LongestPalindromicSubstring_0005;

/**
 * @author: xielongfei
 * @date: 2021/01/15 16:34
 * @description:
 * @version: 2.5
 */
public class L0005_2 {


    //"sknks"

    //中心扩散法 枚举可能出现的回文子串的“中心位置”，从“中心位置”尝试尽可能扩散出去，得到一个回文串
    public static void main(String[] args) {
        System.out.println(longestPalindrome("jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel"));
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String v1 = valid(s, i, i);
            String v2 = valid(s, i, i + 1);
            String v3 = v1.length() > v2.length() ? v1 : v2;
            if (v3.length() > res.length()) {
                res = v3;
            }
        }
        return res;
    }

    private static String valid(String s, int left, int right) {
        int len = s.length();
        while (left >= 0 && right < len) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
