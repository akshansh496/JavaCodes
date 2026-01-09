public class Clear_range_of_bits {
    public static void main(String[] args) {
        int n=10;
        int start=2;
        int end=4;
        System.out.println(n & ((~(0)<<(end+1))|(1<<start)-1));
    }
}
