package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sequential_Digits {
    static List<Integer> ans;
    public static List<Integer> sequentialDigits(int low, int high) {
        ans=new ArrayList<>();
        helper(0,1,low,high);
        Collections.sort(ans);
        return ans;
    }
    public static void helper(int num,int idx,int low,int high){
        if (num > high) return;
        if(num>=low && num<=high){
            ans.add(num);
        }    
        for(int i=idx;i<10;i++){
            if(num!=0 && i!=((num%10)+1)) continue;
            helper(num*10+i,i+1,low,high);
        }
    }
    public static void main(String[] args) {
        System.out.println(sequentialDigits(1000, 13000));
    }
}
