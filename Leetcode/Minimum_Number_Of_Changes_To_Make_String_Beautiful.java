package Leetcode;

public class Minimum_Number_Of_Changes_To_Make_String_Beautiful {

    public static int minChanges(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minChanges("10011100"));
    }
}
