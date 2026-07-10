
import java.util.*;

public class Comparison_String_1837B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int temp=1;
            int max=1;
            char prev=s.charAt(0);
            for(int i=1;i<n;i++){
                if(s.charAt(i)==prev)   temp++;
                else{
                    temp=1;
                    prev=s.charAt(i);
                }
                max=Math.max(max,temp);
            }
            System.out.println(max+1);
        }
    }
}
