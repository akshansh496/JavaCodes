package BackTracking;

public class Permutation {
    public static void main(String[] args) {
        print("abc","");
    }
    public static void print(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int idx = 0; idx < str.length(); idx++) {
            char curr=str.charAt(idx);
            String NewStr=str.substring(0,idx)+str.substring(idx+1);
            print(NewStr, ans+curr);
        }

    }
}
