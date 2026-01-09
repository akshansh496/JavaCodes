package Greedy;
import java.util.*;
public class Activity_Selection {
    // public static void main(String[] args) {
    //     int [] start={1,3,0,5,8,5};
    //     int [] end={2,4,6,7,9,9};

    //     // end time basis sorted

    //     int maxAct=0;
    //     ArrayList<Integer> ans=new ArrayList<>();

    //     // 1st Activity
    //     maxAct=1;
    //     ans.add(0);
    //     int lastEnd=end[0];


    //     for(int i=1;i<end.length;i++){
    //         if(start[i]>lastEnd){
    //             maxAct++;
    //             ans.add(i);
    //             lastEnd=end[i];
    //         }
    //     }

    //     System.out.println("Maximum Activities:"+maxAct);
    //     for(int i=0;i<ans.size();i++){
    //         System.out.print("A"+ans.get(i)+" ");
    //     }
    // }







    // when the arrays aren't sorted as per end time array
    public static void main(String[] args) {
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};

        // sorting
        int Activities[][]=new int[start.length][3];
        for(int i=0;i<end.length;i++){
            Activities[i][0]=i;//1st col stores idx
            Activities[i][1]=start[i];//2nd col stores start time
            Activities[i][2]=end[i]; //3rd col stores end time
        }

        // lambda function
        Arrays.sort(Activities,Comparator.comparingDouble(o -> o[2]));//sorts the 2d array on the basis of end time

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        // 1st Activity
        maxAct=1;
        ans.add(Activities[0][0]);
        int lastEnd=Activities[0][2];

        for(int i=1;i<end.length;i++){
            if(Activities[i][1]>lastEnd){
                maxAct++;
                ans.add(Activities[i][0]);
                lastEnd=Activities[i][2];
            }
        }

        System.out.println("Maximum Activities:"+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
