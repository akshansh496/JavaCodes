package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Sequence {
    static List<String> list=new ArrayList<>();
    static boolean found = false;
    public static String getPermutation(int n, int k) {
        helper(n,k,new boolean[n+1],new StringBuilder());
        return list.get(k-1);
    }
    public static void helper(int n,int k,boolean flag[],StringBuilder str){
        if (found) return; 
        if(str.length()==n){
            list.add(str.toString());
            if (list.size() == k) {  
                found = true;
            }
            return;
        }
        for(int i=1;i<=n;i++){
            if(flag[i]){
                continue;
            }
            str.append(i);
            flag[i]=true;
            helper(n,k,flag,str);
            str.deleteCharAt(str.length()-1);
            flag[i]=false;
        }
    }
    public static void main(String[] args) {
        System.out.println(getPermutation(4, 9));
    }
}
