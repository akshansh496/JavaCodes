// package CodeForces;

import java.util.Scanner;

public class Petya_And_Strings_112A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        a=a.toLowerCase();
        String b=sc.next();
        b=b.toLowerCase();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>b.charAt(i)){
                System.out.println("1");
                System.exit(0);
            }
            else if(a.charAt(i)<b.charAt(i)){
                System.out.println("-1");
                System.exit(0);
            }
        }
        System.out.println("0");
        System.exit(0);
    }
}
