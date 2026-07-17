package Flipkart_Grid_Practice;

import java.util.Stack;

public class String_Manipulation {
    public static void main(String[] args) {
        
    }
    public int helper(String s){
        String pedmas="-+*/^";
        Stack<Integer> st=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x>='a' && x<='z')    continue;
            else if(x>='0' && x<='z'){
                st.add(x-'0');
            }
            else{
                if(op.isEmpty()){
                    op.add(x);
                    continue;
                }
                if(!op.isEmpty() && pedmas.indexOf(x)>=pedmas.indexOf(op.peek())){
                    op.add(x);
                }
            }
        }
        while(!st.isEmpty()){
            int second=st.pop();
            int first=st.pop();
            char x=op.pop();
            if(x=='-')  
        }
    }
}
