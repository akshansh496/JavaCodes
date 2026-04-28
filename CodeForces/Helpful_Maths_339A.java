// package CodeForces;

import java.util.Scanner;

public class Helpful_Maths_339A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int arr[]=new int[10];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+')  continue;
            arr[str.charAt(i)-'0']++;
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<=9;i++){
            while(arr[i]!=0){
                s.append(i).append('+');
                arr[i]--;
            }
        }
        s.deleteCharAt(s.length()-1);
        System.out.println(s.toString());
    }
}
