public class FInd_ith_bit {
    public static void main(String[] args) {
        int n=10;
        int i=3;
        // if((n&1<<(i-1))!=1)
        // System.out.println(1);
        // else
        // System.out.println(0);
        int bitMask=1<<i;
        if((n & bitMask)==0)
        System.out.println(0);
        else
        System.out.println(1);
    }
}
