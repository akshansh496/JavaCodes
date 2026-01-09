package Stack;

import java.util.Stack;

public class Reverse_String {
    public static void main(String[] args) {
        Stack <Character> s =new Stack<>();
        s.push('a');
        s.push('b');
        s.push('c');
        StringBuilder str=new StringBuilder("");
        reverse(s,str);

    } 
    public static void reverse(Stack <Character> s,StringBuilder str){
        if(s.isEmpty()){
            System.out.println(str);
            return;
        }
        str.append(s.pop());
        reverse(s, str);
    }
}
