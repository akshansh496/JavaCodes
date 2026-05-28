import java.util.Scanner;

public class Bear_And_Big_Brother_791A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Limak=sc.nextInt();
        int Bob=sc.nextInt();
        int count=0;
        while(Bob>=Limak){
            count++;
            Limak*=3;
            Bob*=2;
        }
        System.out.println(count);
    }
}
