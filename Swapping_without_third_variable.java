public class Swapping_without_third_variable {
    public static void main(String[] args) {
         int a=54;
         int b=29;
         a=a^b;
         b=b^a;
         a=a^b;
         System.out.println("a:"+a);
         System.out.println("b:"+b);
    }
}
