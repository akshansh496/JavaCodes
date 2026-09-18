package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Find_Players_With_Zero_or_One_losses {

    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<Integer> all = new HashSet<>();
        HashSet<Integer> lossers = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            all.add(matches[i][0]);
            all.add(matches[i][1]);
            lossers.add(matches[i][1]);
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) + 1);
        }
        List<Integer> zero = new ArrayList<>();
        all.removeAll(lossers);
        for (int x : all) {
            zero.add(x);
        }
        List<Integer> one = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                one.add(entry.getKey());
            }
        }
        Collections.sort(zero);
        Collections.sort(one);
        answer.add(zero);
        answer.add(one);
        return answer;
    }

    public static void main(String[] args) {
        int matches[][] = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        List<List<Integer>> answer = findWinners(matches);
        System.out.println(answer);
    }
}
