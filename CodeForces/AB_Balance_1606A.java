
import java.util.Scanner;

public class AB_Balance_1606A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            String s=sc.next();
            int len=s.length();
            String ans;
            if(s.charAt(0)==s.charAt(len-1)){
                System.out.println(s);
                continue;
            }
            else{
                if(s.charAt(0)=='a')    ans='b'+s.substring(1);
                else    ans='a'+s.substring(1);
            }
            System.out.println(ans);
        }
    }
}
