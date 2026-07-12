
import java.util.Scanner;

public class Ezraft_And_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            if(n==1){
                System.out.println(1);
                continue;
            }   
            else if(n==2){
                System.out.println(-1);
                continue;
            }   
            else{
                System.out.print(1+" "+2+" "+3+" ");
                long sum=6;
                int count=3;
                while(count<n){
                    System.out.print(sum+" ");
                    sum*=2;
                    count++;
                }
            }
            System.out.println();
        }
    }
}
