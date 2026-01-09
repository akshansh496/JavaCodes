public class Reverse_number {
    public static void main(String[] args) {
        reverse(193,0);
    }
    public static void reverse(int n,int sum){
        // while(n!=0){
        //     sum=(sum*10)+(n%10);
        //     n=n/10;
        // }
        // System.out.println(sum);


        // if(n==0){
        //     System.out.println(sum);
        //     return;
        // }
        // sum=(sum*10)+(n%10);
        // reverse(n/10,sum);

        int digits=(int)(Math.log10(n))+1;
        System.out.println(helper(n,digits));
    }
    public static int helper(int n,int digits){
        if(n==0){
            return 1;
        }
        int rev=(n%10)*(int)Math.pow(10, digits-1)+helper(n/10,digits-1);
        return rev;
    }
}
