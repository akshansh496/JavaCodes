package Leetcode;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Charcaters {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while (right < s.length()) {
            char x = s.charAt(right);
            if (map.getOrDefault(x, -1) < left) {
                maxLength = Math.max(maxLength, right - left + 1); 
            }else {
                maxLength = Math.max(maxLength, right - map.get(x));
                left = map.get(x) + 1;
            }
            map.put(x, right);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
