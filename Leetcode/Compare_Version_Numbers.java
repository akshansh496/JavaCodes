package Leetcode;

import java.util.StringTokenizer;

public class Compare_Version_Numbers {
    public static void main(String[] args) {
        System.out.println(compareVersion("1.0", "1.0.0.0"));
    }
    public static int compareVersion(String version1, String version2) {
        StringTokenizer st1=new StringTokenizer(version1,".");
        StringTokenizer st2=new StringTokenizer(version2,".");
        while(st1.hasMoreTokens() && st2.hasMoreTokens()){
            int one=Integer.parseInt(st1.nextToken());
            int two=Integer.parseInt(st2.nextToken());
            if(one<two) return -1;
            else if(two>one)    return 1;
        }
        while(st1.hasMoreTokens()){
            int one=Integer.parseInt(st1.nextToken());
            int two=0;
            if(one<two) return -1;
            else if(two>one)    return 1;
        }
        while(st2.hasMoreTokens()){
            int one=Integer.parseInt(st2.nextToken());
            int two=0;
            if(one<two) return -1;
            else if(two>one)    return 1;
        }
        return 0;
    }

}
