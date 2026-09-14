
import java.util.Scanner;

public class MIn_Max_game_2263A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ones=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x==1)    ones++;
            }
            int zeros=n-ones;
            if(ones>zeros){
                System.out.println("Bessie");
                continue;
            }
            else if(ones<zeros){
                System.out.println("Elsie");
                continue;
            }
            else    System.out.println("Bessie");
        }
    }
    
}
