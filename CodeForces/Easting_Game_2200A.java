
import java.util.Scanner;

public class Easting_Game_2200A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE;
            int maxCount=0;
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                if(x==max)  maxCount++;
                if(x>max){
                    max=x;
                    maxCount=1;
                }
            }
            System.out.println(maxCount);
        }
    }
}
