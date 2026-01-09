package Hashmap;

import java.util.*;

public class Strings_Anagrams {
    public static int minSteps(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        int count=0;
        Set<Character> keys=map1.keySet();
        for (Character key : keys) {
            if(map2.containsKey(key) && map1.get(key)>map2.get(key))
            count+=Math.abs(map1.get(key)-map2.get(key));
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minSteps("leetcode","practice"));
    }
}
