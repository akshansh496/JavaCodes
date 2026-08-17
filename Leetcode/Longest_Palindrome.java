package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        if(freq.size()==1)  return s.length();
        boolean single = false;
        int ans = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int count=entry.getValue();
            if (count % 2 == 0) ans+=count;
            else{
                ans += count - 1;
                single=true;
            }
        }
        
        if (single)
            return ans + 1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababababa"));
    }
}
