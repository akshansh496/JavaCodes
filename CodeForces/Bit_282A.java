// package CodeForces;

import java.util.Scanner;

public class Bit_282A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            String str=sc.next();
            if(str.charAt(0)=='+')  ++x;
            else if(str.charAt(0)=='-') --x;
            else if(str.charAt(2)=='+') x++;
            else x--;
        }
        System.out.println(x);
    }
}
