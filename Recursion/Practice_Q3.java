package Recursion;

public class Practice_Q3 {
    public static void main(String[] args) {
        String str="tanvi";
        System.out.println(lengthStr(str+" ",0,0));
    }
    static int lengthStr(String str,int idx,int len){
        if(str.charAt(idx)==' '){
            return len;
        }
        return lengthStr(str,idx+1,len+1);
    }
}
