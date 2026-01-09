import java.util.*;
public class area_perimeter_circle {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r=sc.nextInt();
        double area=3.14*r*r;
        double perimeter=2*3.14*r;
        System.out.println(("AREA:"+area+"\tPERIMETER:"+perimeter));
    }
}
