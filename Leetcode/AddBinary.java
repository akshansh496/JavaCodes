package Leetcode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11","10"));
    }
    public static String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        char x;
        char y;
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i < 0)
                x = '0';
            else
                x = a.charAt(i);
            if (j < 0)
                y = '0';
            else
                y = b.charAt(j);

            if (x == '1' && y == '1') {
                if (carry == 0)
                    str.insert(0, '0');
                else
                    str.insert(0, '1');
                carry = 1;
            }
            if (x == '1' && y == '0') {
                if (carry == 0)
                    str.insert(0, '1');
                else {
                    str.insert(0, '0');
                    carry = 1;
                }
            }
            if (x == '0' && y == '1') {
                if (carry == 0)
                    str.insert(0, '1');
                else {
                    str.insert(0, '0');
                    carry = 1;
                }
            }
            if (x == '0' && y == '0') {
                if (carry == 0)
                    str.insert(0, '0');
                else {
                    str.insert(0, '1');
                    carry = 0;
                }
            }

            i--;
            j--;
        }
        return str.toString();

    }
}
