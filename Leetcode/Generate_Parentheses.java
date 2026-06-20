package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    static List<StringBuilder> ans= new ArrayList<>();;
    public static List<String> generateParenthesis(int n) {
        List<String> mainAns=new ArrayList<>();
        helper(n,new StringBuilder(),0,0);
        for(StringBuilder str:ans){
            mainAns.add(str.toString());
        }
        return mainAns;
    }
    public static void helper(int n,StringBuilder str,int open,int close){
        if(str.length()==(2*n)){
            StringBuilder temp=new StringBuilder(str);
            ans.add(temp);
            return;
        } 
        if(open<n){
            str.append("(");
            helper(n,str,open+1,close);
            str.deleteCharAt(str.length()-1);
        }
        if(close<open){
            str.append(")");
            helper(n,str,open,close+1);
            str.deleteCharAt(str.length()-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}
