
import java.util.*;
public class String_Task_118A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch != 'y')
            str.append('.').append(ch);
            else    continue;
        }
        System.out.println(str.toString());
    }
}
