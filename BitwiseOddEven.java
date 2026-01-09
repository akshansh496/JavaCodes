public class BitwiseOddEven {
    public static void main(String[] args) {
        int a=24;
        if((a&1)==1)
        //becuase any odd number's binary conatins 1 at the zeroth place(LSB)
        System.out.println("odd");
        else 
        System.out.println("even");
    }
}
