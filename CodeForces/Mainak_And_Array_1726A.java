
import java.util.Scanner;

public class Mainak_And_Array_1726A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            arr[0]=sc.nextInt();

            // Maximum value of (arr[i-1] - arr[i])
            // This corresponds to rotating the entire array.
            int adjacent=0;
            for(int i=1;i<n;i++){
                arr[i]=sc.nextInt();
                adjacent=Math.max(adjacent,arr[i-1]-arr[i]);
            }
            if(n==1){
                System.out.println(0);
                continue;
            }
            // -------------------------------
            // Case 1: Keep the first element fixed
            // and maximize the last element.
            // We can make the last element equal to
            // any element from indices 0 to n-2.
            // Answer = max(arr[0...n-2]) - arr[0]
            // -------------------------------
            int max=0;
            for(int i=1;i<n;i++){
                max=Math.max(max, arr[i]);
            }
            int firstFixed=max-arr[0];
            // -------------------------------
            // Case 2: Keep the last element fixed
            // and minimize the first element.
            // We can make the first element equal to
            // any element from indices 1 to n-1.
            // Answer = arr[n-1] - min(arr[1...n-1])
            // -------------------------------
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                min=Math.min(min, arr[i]);
            }
            int lastFixed=arr[n-1]-min;
            // Take the best among all three cases.
            System.out.println(Math.max(Math.max(firstFixed,lastFixed),adjacent));
        }
    }
}
