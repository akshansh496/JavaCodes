public class GetBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<2;
        if((n & bitmask)==0)
            System.out.println("bit was zero");
        else
            System.out.println("bit was one");
    }
}
