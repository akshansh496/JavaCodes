// package CodeForces;

import java.util.Scanner;

public class Next_Round_158A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int val=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i==k-1) val=arr[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=val && arr[i]>0) count++;
            else break;
        }
        System.out.println(count);
    }
}
