public class Palindrome_recusrion {
    public static void main(String[] args) {
        System.out.println(Palindrome("12342321", 0, "12342321".length()-1));
    }
    public static boolean Palindrome(String n,int s,int e){
        if(s>e || s==e){
            return true;
        }
        else if(n.charAt(s)==n.charAt(e)){
            return Palindrome(n, s+1, e-1);
        }
        else
            return false;
    }
}
