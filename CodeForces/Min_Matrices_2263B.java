import java.util.*;
public class Min_Matrices_2263B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[][]=new int[n][n];
            for(int i=0;i<n;i++)    Arrays.fill(arr[i], -1);
            if(k<n){
                System.out.println(-1);
                continue;
            }
            else if(k==2*n){
                System.out.println(-1);
                continue;
            }
            else if(n==k){
                int idx=0;
                int val=1;
                while(idx<n){
                    arr[idx][idx]=val++;
                    idx++;
                }
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(arr[i][j]==-1)   arr[i][j]=val++;
                    }
                }
            }
            else{
                int s=2*n-k;
                int val=1;
                for(int i=0;i<s;i++){
                    arr[i][i]=val++;
                }
                for(int i=s;i<n;i++){
                    arr[i][0]=val++;
                }
                for(int i=s;i<n;i++){
                    arr[0][i]=val++;
                }
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(arr[i][j]==-1)   arr[i][j]=val++;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
