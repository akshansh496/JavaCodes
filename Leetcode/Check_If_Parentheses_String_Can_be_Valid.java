package Leetcode;

public class Check_If_Parentheses_String_Can_be_Valid {
        public static boolean canBeValid(String s, String locked) {
            int len=s.length();
            if(len%2!=0) return false;
            int lopen=0;
            int unlocked=0;
            for(int i=0;i<len;i++){
                if(locked.charAt(i)=='0') unlocked++;
                else{
                    if(s.charAt(i)=='(')   lopen++;
                    else{
                        if(lopen>0) lopen--; 
                        else if(unlocked>0) unlocked--;
                        else return false;
                    }    
                }
            }
            int lclose=0;
            unlocked=0;
            for(int i=len-1;i>=0;i--){
                if(locked.charAt(i)=='0') unlocked++;
                else{
                    if(s.charAt(i)==')')   lclose++;
                    else{
                        if(lclose>0) lclose--; 
                        else if(unlocked>0) unlocked--;
                        else return false;
                    }    
                }
            }
            return true;
        }
        public static void main(String[] args) {
            System.out.println(canBeValid("))()))", "010100"));
        }
}
