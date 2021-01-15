package leetcode.LongestSubstringWithoutRepeatingCharacters_0003;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xielongfei
 * @date: 2021/01/15 14:40
 * @description: 无重复字符的最长子串
 * @version: 2.5
 */
public class L0003_1 {

    //通过
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        //left左指针指向的位置
        int res = 0, left = 0;
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(map.get(c), left);
            }
            res = Math.max(res, i -left + 1);
            map.put(c, i + 1);
        }
        return res;
    }
}
