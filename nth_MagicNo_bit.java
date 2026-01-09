public class nth_MagicNo_bit {
    public static void main(String[] args) {
        int n= 5;
        int base=5;
        int i=1;
        int ans=0;
        while(n>0){
            int last=n&1;
            ans+=last*Math.pow(base,i++);
            n=n>>1;
        }
        System.out.println(ans);
    }
}
