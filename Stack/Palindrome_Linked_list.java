package Stack;
import java.util.*;
public class Palindrome_Linked_list {
    public static void main(String[] args) {
        LinkedList<Character> ll=new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('B');
        ll.add('A');
        ll.add('C');
        Stack<Character> s=new Stack<>();
        StringBuilder str=new StringBuilder("");
        for(Character x:ll){
            s.add(x);
            str.append(x);
        }
        String reversed=reverse(s, new StringBuilder(""));
        if(str.toString().equals(reversed))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
        
    }
    public static String reverse(Stack <Character> s,StringBuilder str){
        if(s.isEmpty()){
            System.out.println(str);
            return str.toString();
        }
        str.append(s.pop());
        return reverse(s, str);
    }
}
