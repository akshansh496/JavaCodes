package Leetcode;

public class Calculate_Digit_Sum_Of_String {

    public static String digitSum(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        while (str.length() > k) {
            int sum = 0;
            StringBuilder newStr = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i != 0 && i % k == 0) {
                    newStr.append(sum);
                    sum = 0;
                }
                sum += str.charAt(i) - '0';
            }
            newStr.append(sum);
            str = newStr;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
    }
}
