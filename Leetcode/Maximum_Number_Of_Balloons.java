package Leetcode;

import java.util.HashMap;

public class Maximum_Number_Of_Balloons {
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char x=text.charAt(i);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return Math.min(
            Math.min(map.getOrDefault('b', 0),
                     map.getOrDefault('a', 0)),
            Math.min(
                Math.min(map.getOrDefault('l', 0) / 2,
                         map.getOrDefault('o', 0) / 2),
                map.getOrDefault('n', 0)
            )
        );
    }
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }
}
