package Leetcode;

public class Stone_Removal_Game {

    public static boolean canAliceWin(int n) {
        boolean flag = false;
        int limit = 10;
        while (n >= limit) {
            n -= limit--;
            flag = !flag;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(canAliceWin(12));
    }
}
