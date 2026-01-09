package BackTracking;

public class KeypadCombinations {
    public static void main(String[] args) {
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Combinations(arr[2], arr[3],0,0);
    }
    public static void Combinations(String a,String b,int idx1,int idx2){ 
            if(!(idx1<a.length())){
                return;
            }
            if(!(idx2<b.length())){
                Combinations(a, b, idx1+1, 0);
                return;
            }
            String ans=a.charAt(idx1)+""+b.charAt(idx2);
            System.out.println(ans);
            Combinations(a, b, idx1, idx2+1);
    }
}
