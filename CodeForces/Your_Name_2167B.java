package CodeForces;

import java.util.*;

public class Your_Name_2167B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q!=0){
            q--;
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            if (s.length() != t.length()) {
                System.out.println("No");
                continue;
            }
            int count1[] = new int[26];
            int count2[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count1[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                count2[t.charAt(i) - 'a']++;
            }
            boolean flag=false;
            for (int i = 0; i < 26; i++) {
                if (count1[i] != count2[i]) {
                    System.out.println("No");
                    flag=true;
                    break;
                }
            }
            if(flag) continue;
            System.out.println("Yes");
        }
        
    }
}
