package Leetcode;

import java.util.Stack;

public class Valid_Parenthesis_String {

    public static boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(') {
                open.push(i);
            } else if (x == '*') {
                star.push(i);
            } else {
                if (!open.isEmpty()) {
                    open.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }
        while (!open.isEmpty()) {
            if (star.isEmpty()) {
                return false;
            }
            int openIndex = open.pop();
            int starIndex = star.pop();
            if (starIndex < openIndex) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
    }
}
