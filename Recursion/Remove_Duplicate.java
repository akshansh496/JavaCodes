package Recursion;

public class Remove_Duplicate {
    public static void main(String[] args) {
        System.out.println(remove("apnacollege", 0,""));
    }
    public static String remove(String str,int idx,String ans){
        // String ans="";
        // for (int i = 0; i < str.length()-1; i++) {
        //     if(i==str.indexOf(str.charAt(i)))
        //     ans+=str.charAt(i);
        // }
        // return ans;
        if(idx==str.length()-1)
        return ans;
        else if(idx==str.indexOf(str.charAt(idx)))
        ans+=str.charAt(idx);
        return remove(str, idx+1, ans);
    }
}
