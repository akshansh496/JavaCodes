package Leetcode;

public class Reverse_Words_In_String {
    public static String reverseWords(String s) {
        s=s.trim();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)==' ')  continue;
            str.append(s.charAt(i));
        }
        int end=str.length();
        if(end==1)  return str.toString();
        StringBuilder ans=new StringBuilder();
        for(int i=str.length()-2;i>=0;i--){
            if((str.charAt(i)==' ')){
                ans.append(str.substring(i+1,end)+" ");
                end=i;
            }
            if(i==0)    ans.append(str.substring(i,end));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("   a good   example     "));
    }
}
