package Leetcode;

import java.util.HashSet;

public class Count_the_Number_of_Special_Characters_II {
    public static int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        int count=0;
        for(Character x:set){
            if(Character.isUpperCase(x) && set.contains((char)(x+32))){
                if(word.lastIndexOf((char)(x+32)) < word.indexOf(x)) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String word = "aaAbcBC";
        System.out.println(numberOfSpecialChars(word));
    }
}

