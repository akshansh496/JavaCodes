package Leetcode;

public class Minimum_Operations_To_Transform_String {
    public static int minOperations(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='a')  continue;      
            max=Math.max(max,Math.abs(123-x));
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(minOperations("yz"));
    }
}
