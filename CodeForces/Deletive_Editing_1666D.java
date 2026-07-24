
import java.util.*;

public class Deletive_Editing_1666D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            String s = sc.next();
            String t = sc.next();
            int freq[] = new int[26];
            for(int i=0;i<t.length();i++){
                freq[t.charAt(i)-'A']++;
            }
            StringBuilder sb = new StringBuilder(s);

            for (int i = sb.length() - 1; i >= 0; i--) {
                if (freq[sb.charAt(i) - 'A'] > 0) {
                    freq[sb.charAt(i) - 'A']--; 
                }else {
                    sb.setCharAt(i, '#');
                }
            }

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) != '#') {
                    ans.append(sb.charAt(i));
                }
            }

            System.out.println(ans.toString().equals(t) ? "YES" : "NO");
        }
        // StringBuilder str=new StringBuilder(s);
        // int i=0;int j=0;
        // boolean flag=false;
        // while(i<str.length() && j<t.length()){
        //     if(str.charAt(i)!=t.charAt(j)){
        //         if(str.indexOf(str.charAt(i)+"")==i || str.indexOf(str.charAt(i)+"")==i-1)   str.deleteCharAt(i);
        //         else{
        //             System.out.println("NO");
        //             flag=true;
        //             break;
        //         }
        //     }
        //     else{
        //         i++;j++;
        //     }   
        // }
        // if(flag) continue;
        // while(i<str.length()){
        //     if(str.indexOf(str.charAt(i)+"")!=i){
        //         System.out.println("NO");
        //         flag=true;
        //         break;
        //     }
        //     i++;
        // }
        // if(flag) continue;
        // if(j<t.length())
        // System.out.println("NO");
        // else
        // System.out.println("YES");
    }
}
