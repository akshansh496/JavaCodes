import java.util.*;
public class circumference {
    public static double circumference(int r){
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius");
        int radius=sc.nextInt();
        System.out.println(circumference(radius));
    }
}
