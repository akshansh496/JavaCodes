public class UniqueNumberBitManiplation {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,2,3,5};
        int Unique=0;
        for(int num:arr){
            Unique^=num;// rules for XOR: a^a=0,a^0=a 
        }
        System.out.println(Unique);
    }
}
