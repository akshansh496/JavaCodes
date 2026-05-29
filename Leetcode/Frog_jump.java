package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Frog_jump {
    static HashMap<String, Boolean> memo = new HashMap<>();
    public static boolean canCross(int[] stones) {
        if(stones.length < 2 || stones[1] != 1)
        return false;
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            set.add(stones[i]);
            map.put(stones[i], i);
        }
        return helper(stones,1,1,set,map);
    }
    public static boolean helper(int[] stones,int move,int idx,HashSet<Integer> set, HashMap<Integer, Integer> map ){
        if(idx==stones.length-1)  return true;
        String key = idx + "," + move;
        if (memo.containsKey(key))
            return memo.get(key);
        boolean ans = false;

        if (set.contains(stones[idx] + move)) {
            ans = helper(stones, move,
                    map.get(stones[idx] + move),
                    set, map);
        }

        if (!ans && move > 1 && set.contains(stones[idx] + move - 1)) {
            ans = helper(stones, move - 1,
                    map.get(stones[idx] + move - 1),
                    set, map);
        }

        if (!ans && set.contains(stones[idx] + move + 1)) {
            ans = helper(stones, move + 1,
                    map.get(stones[idx] + move + 1),
                    set, map);
        }

        memo.put(key, ans);
        return ans;
    }
    public static void main(String[] args) {
        int stones[]={0,1,3,5,6,8,12,17};
        System.out.println(canCross(stones));
    }
}

