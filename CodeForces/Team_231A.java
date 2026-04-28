// package CodeForces;

import java.util.*;

public class Team_231A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            int a=sc.nextInt();
            if(a==1) count++;
            int b=sc.nextInt();
            if(b==1) count++;
            int c=sc.nextInt();
            if(c==1) count++;
            if(count>=2) ans++;
        }
        System.out.println(ans);
    }
}
