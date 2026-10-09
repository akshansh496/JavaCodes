package Leetcode;

public class Minimum_Insertions_To_Balance_Parantheses_String {

    public static int minInsertions(String s) {
        int open = 0;
        int insertion = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(') {
                open++; 
            }else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; 
                }else {
                    insertion++;
                }
                if (open > 0) {
                    open--; 
                }else {
                    insertion++;
                }
            }
        }
        return insertion + open * 2;
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("()())))()"));
    }
}
