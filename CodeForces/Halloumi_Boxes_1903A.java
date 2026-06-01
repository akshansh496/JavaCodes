import java.util.*;
public class Halloumi_Boxes_1903A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            int prev=Integer.MIN_VALUE;
            boolean sorted=true;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(prev>arr[i]) sorted=false;
                prev=arr[i];
            }
            if(k>1) System.out.println("YES");
            else{
                if(sorted)  System.out.println("YES");
                else    System.out.println("NO");
            }
        }
    }
}
