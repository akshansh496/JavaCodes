import java.util.*;
public class Make_It_Beautiful_1783 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            arr[0]=sc.nextInt();
            boolean flag=true;
            for(int j=1;j<n;j++){
                arr[j]=sc.nextInt();
                if(arr[j]!=arr[j-1])    flag=false;
            }
            if(flag){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            Arrays.sort(arr);
            System.out.print(arr[n-1]+" ");
            for(int j=0;j<n-1;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
