package Queue;
import java.util.*;
public class First_Non_Repeating {
    public static void main(String[] args) {
        String str="aabccxb";
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            q.add(x);
            freq[x-'a']++;
                while(!q.isEmpty() && freq[q.peek()-'a']>1){
                    q.remove();
                }
                if(q.isEmpty())
                System.out.print(-1+" ");
                else
                System.out.print(q.peek()+" ");
        }
    }
}
