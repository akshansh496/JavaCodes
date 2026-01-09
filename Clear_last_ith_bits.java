public class Clear_last_ith_bits {
    public static void main(String[] args) {
        int n=15;
        int i=2;
        int bitmask=~(0)<<i;//because ~(0) i.e. -1's binary is 111111111
        System.out.println(n & bitmask);
    }
}
