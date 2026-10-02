package Leetcode;

import java.util.Arrays;

public class Maximum_Nesting_Depth_of_Two_Valid_Parantheses_Strings {

    public static int[] maxDepthAfterSplit(String seq) {
        int openFlag = 0;
        int closedFlag = 0;
        int ans[] = new int[seq.length()];
        for (int i = 0; i < seq.length(); i++) {
            char x = seq.charAt(i);
            if (x == '(') {
                ans[i] = openFlag;
                openFlag = (openFlag == 0) ? 1 : 0;
            } else {
                ans[i] = closedFlag;
                closedFlag = (closedFlag == 0) ? 1 : 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans[] = maxDepthAfterSplit("()(())()");
        System.out.println(Arrays.toString(ans));
    }
}
