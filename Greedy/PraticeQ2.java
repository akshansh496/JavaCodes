// 🧩 Problem Statement

// You are given:

// Two integers L and R — defining a range [L, R]

// An integer K

// You must find the K-th largest odd number in that range (inclusive).

// If there are fewer than K odd numbers, return 0.
package Greedy;
public class PraticeQ2 {
    public static void main(String[] args) {
        int L=-3;
        int R=3;
        int k=1;
        if(R%2==0) R--;
        int ans = R - (k - 1) * 2;

        if (ans < L) System.out.println(0);
        else System.out.println(ans);
        // if(L%2==0) L++;
        // ArrayList<Integer> arr=new ArrayList<>();
        // for(int i=L;i<=R;i+=2){
        //     arr.add(i);
        // }
        // if(k>arr.size()) System.out.println(0);
        // else System.out.printlxn(arr.get(arr.size()-k));
    }
}
