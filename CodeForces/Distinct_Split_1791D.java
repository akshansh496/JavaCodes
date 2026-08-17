
import java.util.*;

public class Distinct_Split_1791D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            HashSet<Character> set=new HashSet<>();
            int idx=0;
            for(int i=0;i<s.length();i++){
                if(!set.contains(s.charAt(i)))  set.add(s.charAt(i));
                else{
                    idx=i;
                    break;
                }   
            }
            String one=s.substring(0,idx);
            String two=s.substring(idx);
            System.out.println(helper(one)+helper(two));
        }
    }
    public static int helper(String s){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)   set.add(s.charAt(i));
        return set.size();
    }
}
