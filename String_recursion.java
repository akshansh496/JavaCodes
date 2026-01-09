public class String_recursion {
    public static void main(String[] args) {
        String str="baccad";
        System.out.println(RemoveA(str,"",0));
    }
    public static String RemoveA(String str,String ans,int i){
        if(str== null || i==str.length()){
            return ans;
        }
        char x=str.charAt(i);
        if(x=='a'){
            return RemoveA(str,ans,i+1);
        }
        else{
            ans+=x;
            return RemoveA(str, ans, i+1);
        }
    }
}
