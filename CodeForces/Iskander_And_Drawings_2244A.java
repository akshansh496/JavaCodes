
import java.util.Scanner;

public class Iskander_And_Drawings_2244A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int max=0;
            int count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='#'){
                    count++;
                    max=Math.max(count,max);
                }  
                else    count=0;
            }
            int sec = (max + 1) / 2;
            System.out.println(sec);
        }
    }
}
