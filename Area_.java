import java.util.*; 
public class Area_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose shape");
        String shape=sc.nextLine().toLowerCase();
        switch (shape){
            case "circle":
                circle_area(sc);
                break;
            case "triangle":
                triangle_area(sc);
                break;
            case "rectangle":
                rectangle_area(sc);
                break;
            case "parallelogram":
                parallelogram_area(sc);
                break;
            case "rhombus":
                rhombus_area(sc);
                break;
            case "equilateral triangle":
                equilateral_triangle_area(sc);
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
    public static void circle_area(Scanner sc){
        System.out.println("Enter radius");
        double r=sc.nextDouble();
        System.out.println("Area="+3.14*r*r);
    }
    public static void triangle_area(Scanner sc){
        System.out.println("Enter heigth");
        double h=sc.nextDouble();
        System.out.println("Enter base");
        double b=sc.nextDouble();
        System.out.println("Area="+0.5*b*h);
    }
    public static void rectangle_area(Scanner sc){
        System.out.println("Enter length");
        double l=sc.nextDouble();
        System.out.println("Enter breadth");
        double b=sc.nextDouble();
        System.out.println("Area="+l*b);
}
    public static void parallelogram_area(Scanner sc){  
        System.out.println("Enter heigth");
        double h=sc.nextDouble();
        System.out.println("Enter base");
        double b=sc.nextDouble();
        System.out.println("Area="+b*h);
    }
    public static void rhombus_area(Scanner sc){  
        System.out.println("Enter diagonal1");
        double d1=sc.nextDouble();
        System.out.println("Enter diagonal2");
        double d2=sc.nextDouble();
        System.out.println("Area="+0.5*d1*d2);
    }
    public static void equilateral_triangle_area(Scanner sc){  
        System.out.println("Enter side");
        double s=sc.nextDouble();
        System.out.println("Area="+Math.sqrt(3)/4*s*s);
    }
}


