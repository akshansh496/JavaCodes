public class Power_of_2 {
    public static void main(String[] args) {
        int n=32;
        int bitmask=n & (n-1);
        if( bitmask== 0)
        System.out.println("Power of 2");
        else
        System.out.println("not Power of 2");
    }
}
