package Stack;
import java.util.*;
public class Valid_Parenthesis {
    public static void main(String[] args) {
        String str="((){}[])";
        System.out.println(helper(str));
    }
    public static boolean helper(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x=='{'|| x=='[' || x=='(')
            s.push(x);
            else {
                if (s.isEmpty()) return false;
                char top = s.peek();
                if ((x == '}' && top == '{') ||
                    (x == ']' && top == '[') ||
                    (x == ')' && top == '(')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
