
import java.util.Scanner;

public class Prepend_And_Append_1791C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int n=sc.nextInt();
            String s=sc.next();
            int start=0;
            int end=n-1;
            int count=n;
            while(start<end){
                if(s.charAt(start)==s.charAt(end))  break;
                else{
                    count-=2;
                }
                start++;
                end--;
            }
            System.out.println(count);
        }
    }
}
