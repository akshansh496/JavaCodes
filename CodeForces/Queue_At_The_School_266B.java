
import java.util.Scanner;

public class Queue_At_The_School_266B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        StringBuilder ans=new StringBuilder(s);
        while(t>0){
            int idx=0;
            while(true){
                idx=ans.indexOf("BG",idx);
                if(idx<0)   break;
                ans.setCharAt(idx, 'G');
                ans.setCharAt(idx+1, 'B');
                idx=idx+2;
            }
            t--;
        }
        System.out.println(ans.toString());
    }
}
