
import java.util.*;

public class Three_Indices_1380A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            //left
            int left[]=new int[n];
            left[0]=0;
            int leftMin=arr[0];
            for (int i = 1; i < n; i++) {
                if(arr[i]<leftMin){
                    leftMin=arr[i];
                    left[i]=i;
                }
                else    left[i]=left[i-1];
            }
            //right
            int right[]=new int[n];
            right[n-1]=n-1;
            int rightMin=arr[n-1];
            for(int i=n-2;i>=0;i--){
                if(arr[i]<rightMin){
                    rightMin=arr[i];
                    right[i]=i;
                }
                else    right[i]=right[i+1];
            }
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(arr[i] > arr[left[i]] && arr[i]>arr[right[i]]){
                    System.out.println("YES");
                    System.out.println((left[i]+1)+" "+(i+1)+" "+(right[i]+1));
                    flag=false;
                    break;
                }
            }
            if(flag)    System.out.println("NO");
        }
    }
}

