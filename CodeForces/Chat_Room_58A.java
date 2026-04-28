import java.util.*;
public class Chat_Room_58A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="hello";
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(idx==str.length()){
                System.out.println("YES");
                return;
            }   
            if(str.charAt(idx)==s.charAt(i))    idx++;
        }
        if(idx==str.length())   System.out.println("YES");
        else    System.out.println("NO");
    }
}
