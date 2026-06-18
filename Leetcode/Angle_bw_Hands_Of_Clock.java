package Leetcode;

public class Angle_bw_Hands_Of_Clock {
    public static double angleClock(int hour, int minutes) {
        double AngleOfOneHour=(360/12.0);
        double hr=(hour%12)+(minutes/60.0);
        double min=minutes/5.0;
        double ans=Math.abs(hr-min)*AngleOfOneHour;
        return Math.min(ans,360.0-ans);
    }
    public static void main(String[] args) {
        System.out.println(angleClock(1, 55));
    }
}
