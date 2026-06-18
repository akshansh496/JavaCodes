import java.util.*;
public class Array_Coloring_1857A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int a[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            if(sum%2!=0){
                System.out.println("NO");
                continue;
            }
            int temp=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                temp+=a[i];
                sum-=a[i];
                if((Math.abs(sum-temp))%2==0){
                    flag=true;
                    break;
                }
            }
            if(flag)    System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
