import java.util.Scanner;

public class Twin_Permutations_1831A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int j=0;j<testcase;j++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int  i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans[]=new int[n];
            for(int i=0;i<n;i++){
                ans[i]=n+1-arr[i];
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
