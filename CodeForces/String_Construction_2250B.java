
import java.util.Scanner;

public class String_Construction_2250B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n-k<=1){
                System.out.println(-1);
                continue;
            }
            System.out.print("1 ");
            boolean flag=true;
            for(int i=1;i<n;i++){
                if(k>0) {
                    if(flag){
                        System.out.print("0 0 ");
                        flag=false;
                    }    
                    else {
                        System.out.print("1 1 ");
                        flag=true;
                    }   
                    k--;
                }
                else {
                    if(flag){
                        System.out.print("0 ");
                        flag=false;
                    }   
                    else {
                        System.out.print("1 ");
                        flag=true;
                    } 
                }
            }
            System.out.println();
        }
    }
}
