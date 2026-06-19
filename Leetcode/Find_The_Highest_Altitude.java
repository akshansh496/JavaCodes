package Leetcode;

public class Find_The_Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int max=0;
        int height=0;
        for(int i=0;i<gain.length;i++){
            height+=gain[i];
            max=Math.max(max,height);
        }
        return max;
    }
    public static void main(String[] args) {
        int gain[]={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
