package Leetcode;

public class Smallest_Palindromic_Rearrangement_1 {
    public static String smallestPalindrome(String s) {
        int len=s.length();
        if(len==1)   return s;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int idx=0;
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<26;i++){
            while(freq[i]!=0){
                str.setCharAt(idx,(char)(i+'a'));
                freq[i]--;
                if(freq[i]==0){
                    break;
                }  
                str.setCharAt(len-1-idx,(char)(i+'a'));
                freq[i]--;
                idx++;
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(smallestPalindrome("babab"));
    }
}
