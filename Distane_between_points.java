import java.util.*;
public class Distane_between_points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordinates of first point");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Enter coordinates of second point");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        System.out.println(distance(x1,y1,x2,y2));
    }
    public static double distance(int a,int b,int c,int d){
        int x=(a-c)*(a-c);
        int y=(d-b)*(d-b);
        return Math.sqrt(x+y);
    }
}
