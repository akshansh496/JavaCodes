
import java.util.Scanner;

public class Not_Dividing_1749B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            int prev=sc.nextInt();
            if(prev==1) prev++;
            System.out.print(prev+" ");
            for(int i=1;i<n;i++){
                int curr=sc.nextInt();
                if(curr==1) curr++;
                if(curr>=prev && curr%prev==0)
                    curr++;
                prev=curr;
                System.out.print(prev+" ");
            }
            System.out.println();
        }
    }
}
