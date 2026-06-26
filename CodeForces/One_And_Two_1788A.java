
import java.util.Scanner;

public class One_And_Two_1788A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int a[]=new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==2) count++;
            }
            if (count % 2 != 0) {
                System.out.println(-1);
                continue;
            }
            int c=0;
            boolean flag=true;
            for(int i=0;i<n-1;i++){
                if(a[i]==2) c++;
                if(c==(count/2)){
                    flag=false;
                    System.out.println(i+1);
                    break;
                }
            }
            if(flag)    System.out.println(-1);

        }
    }
}
