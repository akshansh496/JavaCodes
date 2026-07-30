package Leetcode;

public class Minimum_Number_Of_Pushses_To_Type_Word_1 {
    public static int minimumPushes(String word) {
        int len=word.length();
        int press=1;
        int count=0;
        while(len>0){
            if(len<8)   count+=len*press;
            else    count+=8*press;
            press++;
            len-=8;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minimumPushes("xycdefghij"));
    }
}
