// package CodeForces;

import java.util.Scanner;

public class Game_2199A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            int AliceOne=sc.nextInt();
            int BobOne=sc.nextInt();
            int AliceTwo=sc.nextInt();
            int BobTwo=sc.nextInt();
            int totalAlice=AliceOne+AliceTwo;
            int totalBob=BobOne+BobTwo;
            if(totalAlice<(totalBob+k)){
                System.out.println("YES");
            }
            else if(totalAlice==(totalBob+k)){
                if(AliceOne>BobOne && AliceTwo>BobTwo) 
                System.out.println("No");
                else
                System.out.println("YES");
                continue;
            }
            else
            System.out.println("No");
        }
    }
}
