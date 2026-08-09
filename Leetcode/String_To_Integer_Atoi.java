package Leetcode;

public class String_To_Integer_Atoi {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;
        boolean sign = true;
        if (s.charAt(0) == '-') {
            sign = false;
            s = s.substring(1);
        } else if (s.charAt(0) == '+')
            s = s.substring(1);
        int end = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                end = i;
                break;
            }
        }
        s = s.substring(0, end);
        if (s.length() == 0)
            return 0;
        long limit;

        if (sign)
            limit = Integer.MAX_VALUE; // 2147483647
        else
            limit = -(long) Integer.MIN_VALUE; // 2147483648
        long ans = helper(s, limit);

        if (ans > limit) {
            if (sign)
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;
        }

        if (!sign)
            return (int) -ans;

        return (int) ans;
    }

    public static long helper(String s, long limit) {
        long ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (ans > limit / 10 ||
                (ans == limit / 10 && digit > limit % 10)) {
                return limit + 1;
            }

            ans = ans * 10 + digit;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"));
    }
}
