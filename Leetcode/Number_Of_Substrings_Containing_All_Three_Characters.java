package Leetcode;
// Given a string s consisting only of characters a, b and c.

// Return the number of substrings containing at least one occurrence of all these characters a, b and c.
public class Number_Of_Substrings_Containing_All_Three_Characters {
    public static int numberOfSubstrings(String s) {
        int n=s.length();
        int left=0;
        int count=0;
        int freq[]=new int[3];
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'a']++;
            while (freq[0]>0 && freq[1]>0 && freq[2]>0){
                    count+=n-right;
                    freq[s.charAt(left)-'a']--;
                    left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("aaabc"));
    }
}
