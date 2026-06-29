
import java.util.Scanner;

public class Everybody_Likes_Good_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int n=sc.nextInt();
            int count=0;
            int prev=sc.nextInt();
            for(int j=1;j<n;j++){
                int curr=sc.nextInt();
                if((curr%2==0 && prev%2==0) || (curr%2!=0 && prev%2!=0)) {
                    prev=prev*curr;
                    count++;
                }   
                else    prev=curr;
            }
            System.out.println(count);
        }
    }
}
