package Recursion;

import java.util.ArrayList;

public class Practice_Q4 {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>();
        String s="abcab";
        // for (int i = 0; i < s.length(); i++) {
        //     for(int j=i+1;j<=s.length();j++){
        //         list.add(s.substring(i,j));
        //     }
        // }
        // System.out.println(list);

        
        ArrayList<String> list=check(s, 0, 1, new ArrayList<String>());
        for(int i=0; i<list.size(); i++) {
            String str=list.get(i);
            if(str.charAt(0)==str.charAt(str.length()-1))
            System.out.println(str);
        }
 
    }
    static ArrayList<String> check(String s,int i,int j,ArrayList<String> list){
        if(i<s.length()){
            if((j)<=s.length()){
                list.add(s.substring(i,j));
                return check(s, i, j+1,list );
            }
            return check(s, i+1, i+2, list);
        }
        return list;
    }
    // static void check(String str,int idx){
    //     if(idx==str.length())
    //     check(str.substring(idx+1), idx);

    // }
}
