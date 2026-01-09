package ArrayList;

import java.util.ArrayList;

public class ContainerWater {
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
        System.out.println(storeWaterOptimised(height));
    }
    public static int storeWater(ArrayList<Integer>height){
        int max=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int h=Math.min(height.get(i), height.get(j));
                int w=j-i;
                int water=h*w;
                max=Math.max(max, water);
            }
        }
        return max;
    }

    // 2 pointer approach
    public static int storeWaterOptimised(ArrayList<Integer>height){
        int max = 0;
        int lft=0;
        int rgt=height.size()-1;
        while(lft<rgt){

                // calculate water area
                int left=height.get(lft);
                int right=height.get(rgt);
                int h=Math.min(left, right);
                int w=rgt-lft;
                int water=h*w;
                max=Math.max(max, water);

                // update ptr
                if(left<right)
                lft++;
                else
                rgt--;
                
        }
        return max;
    }
}
