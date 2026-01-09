package Stack;
import java.util.*;
public class PraticeQ3 {
    public static void main(String[] args) {
        decode("");
    }
    public static Stack<Character> decode(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(Character.isDigit(x)){
                st.push(x);
            }
        }
        return
        }
}
