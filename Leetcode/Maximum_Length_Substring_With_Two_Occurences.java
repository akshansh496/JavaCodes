package Leetcode;
public class Maximum_Length_Substring_With_Two_Occurences {
    public static void main(String[] args) {
        System.out.println(maximumLengthSubstring("bcbbbcba"));
    }
    public static int maximumLengthSubstring(String s) {
        int max=0;
        int left=0;
        int freq[]=new int[26];
        for(int right=0;right<s.length();right++){
            char x=s.charAt(right);
            freq[x-'a']++;
            while(freq[x-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            max=Math.max(max,right - left + 1);
        }
        return max;
    }
}