package Stack;
import java.util.*;
public class Duplicate_Parentheses {
    public static void main(String[] args) {
        String str="(a+(b))";
        if(helper(str))
        System.out.println("Duplicate found");
        else
        System.out.println("Duplicate not found");
    }
    public static boolean helper(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if( x=='{' || x=='(' || x=='[' || x=='+' || x=='-' || x=='*' || x=='/' || x>='a' && x<='z')
            s.push(x);
            else{
                int  count=0;
                if( x=='}'){
                    while(!s.isEmpty() && s.peek()!='{'){
                        count++;
                        s.pop();
                    }
                    if(!s.isEmpty())
                    s.pop();
                }
                else if( x==']' ){
                    while(!s.isEmpty() && s.peek()!='['){
                        count++;
                        s.pop();
                    }
                    if(!s.isEmpty())
                    s.pop();
                }
                else if( x==')' ){
                    while(!s.isEmpty() && s.peek()!='('){
                        count++;
                        s.pop();
                    }
                    if(!s.isEmpty())
                    s.pop();
                }
                if(count<1)
                return true;
            }
        }
        return false;
    }
}
