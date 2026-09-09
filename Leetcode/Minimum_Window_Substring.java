package Leetcode;

public class Minimum_Window_Substring {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.minWindow("ADOBECODEBANC", "ABC"));
    }
}
class Solution {
    public String minWindow(String s, String t) {

        // BRUTE-FORCE
        // int slen=s.length();
        // int tlen=t.length();
        // if(slen<tlen)   return "";
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<tlen;i++){
        //     map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        // } 
        // int startIdx=0;
        // int endIdx=-1;
        // int min=s.length() + 1;
        // for(int i=0;i<slen;i++){
        //     HashMap<Character,Integer> copy = new HashMap<>(map);
        //     int end=-1;
        //     for(int j=i;j<slen;j++){
        //         char x=s.charAt(j);
        //         if(copy.containsKey(x)){
        //             copy.put(x,copy.get(x)-1);
        //             if(copy.get(x)==0)   copy.remove(x);
        //             if(copy.size()==0){
        //                 end=j;
        //                 break;
        //             }
        //         }
        //     }
        //     if(end != -1 && end-i+1<min){
        //         startIdx=i;
        //         endIdx=end;
        //         min=end-i+1;
        //     }
        // }
        // String ans=s.substring(startIdx,endIdx+1);
        // return ans;
        int slen = s.length();
        int tlen = t.length();
        int left = 0;
        int right = 0;
        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }
        int required = t.length();
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        while (left < slen && right < slen) {
            char x = s.charAt(right);
            if (freq[x] > 0) {
                required--;
            }
            freq[x]--;
            while(required==0){
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                freq[leftChar]++;
                if (freq[leftChar] > 0) {
                    required++;
                }
                left++;
            }
            right++;
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}