package Leetcode;

public class Weighted_Word_Mapping {
        public static String mapWordWeights(String[] words, int[] weights) {
            StringBuilder str=new StringBuilder();
            for(String word:words){
                int sum=0;
                for(int i=0;i<word.length();i++){
                    char x=word.charAt(i);
                    sum+=weights[x-'a'];
                }
                sum=sum%26;
                str.append((char)('z'-sum));
            }
            return str.toString();
        }
    public static void main(String[] args) {
        String words[]={"abcd","def","xyz"};
        int weights[]={5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words, weights));
    }
}
