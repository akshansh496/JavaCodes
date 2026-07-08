package Leetcode;

import java.util.Arrays;

public class Concatenate_NonZero_Digits_Multiply_By_Sum {
        static int mod = 1000000007;
    
        public static int[] sumAndMultiply(String s, int[][] queries) {
            int len = s.length();
            long sum[] = new long[len+1];
            long prefixValue[] = new long[len];
            int count[] = new int[len];
            long[] pow10 = new long[len+1];
            pow10[0] = 1;
            for (int i = 1; i <= len; i++) {
                pow10[i] = (pow10[i - 1] * 10) % mod;
            }
            count[0] = (s.charAt(0) == '0' ? 0 : 1);
            if (s.charAt(0) == '0')
                prefixValue[0] = 0;
            else
                prefixValue[0] = s.charAt(0) - '0';
            sum[0] = s.charAt(0) - '0';
            for (int i = 1; i < len; i++) {
                int digit = s.charAt(i) - '0';
                sum[i] = sum[i - 1] + digit;
                if (digit == 0) {
                    count[i] = count[i - 1];
                    prefixValue[i] = prefixValue[i - 1];
                } else {
                    count[i] = count[i - 1] + 1;
                    prefixValue[i] = (prefixValue[i - 1] * 10 + digit) % mod;
                }
            }
            int querielength = queries.length;
            int ans[] = new int[querielength];
            for (int i = 0; i < querielength; i++) {
                int start = queries[i][0];
                int end = queries[i][1];
                long digitSum;
                long x;
                if (start == 0) {
                    digitSum = sum[end];
                    x = prefixValue[end];
                } else {
                    digitSum = sum[end] - sum[start - 1];
                    int digits = count[end] - count[start - 1];
                    x = (prefixValue[end] - (prefixValue[start - 1] * pow10[digits]) % mod + mod) % mod;
                }
                ans[i] = (int) ((x * (digitSum % mod)) % mod);
            }
            return ans;
        }
        public static void main(String[] args) {
            int queries[][]={{0,9}};
            int ans[]=sumAndMultiply("9876543210", queries);
            System.out.println(Arrays.toString(ans));
        }   
}
