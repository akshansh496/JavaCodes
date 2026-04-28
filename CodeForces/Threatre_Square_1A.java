// package CodeForces;

import java.util.Scanner;

public class Threatre_Square_1A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();
        long tilesAlongN=(long)Math.ceil((double)n/a);
        long tilesAlongM=(long)Math.ceil((double)m/a);
        System.out.println(tilesAlongM*tilesAlongN);
    }
}
