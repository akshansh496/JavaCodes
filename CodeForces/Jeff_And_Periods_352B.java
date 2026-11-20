
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.*;

public class Jeff_And_Periods_352B {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     HashMap<Integer, List<Integer>> map = new HashMap<>();
    //     for (int i = 0; i < n; i++) {
    //         int x = sc.nextInt();
    //         List<Integer> list = new ArrayList<>();
    //         if (map.containsKey(x)) {
    //             list = map.get(x);
    //         }
    //         list.add(i);
    //         map.put(x, list);
    //     }
    //     TreeMap<Integer, Integer> ans = new TreeMap<>();
    //     for (Integer key : map.keySet()) {
    //         List<Integer> list = map.get(key);
    //         if (list.size() == 1) {
    //             ans.put(key, 0);
    //             continue;
    //         }
    //         int commonDifference = list.get(1) - list.get(0);
    //         if (list.size() == 2) {
    //             ans.put(key, commonDifference);
    //             continue;
    //         }
    //         boolean flag = true;
    //         for (int j = 2; j < list.size(); j++) {
    //             if ((list.get(j) - list.get(j - 1)) != commonDifference) {
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if (flag) {
    //             ans.put(key, commonDifference);
    //         }
    //     }
    //     System.out.println(ans.size());
    //     for (Integer key : ans.keySet()) {
    //         System.out.println(key + " " + ans.get(key));
    //     }
    // }
    public static void main(String[] args) throws IOException {

        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in));
        in.nextToken();
        int n = (int) in.nval;
        HashSet<Integer> bad = new HashSet<>();
        TreeMap<Integer, Integer> diff = new TreeMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < n; i++) {
            in.nextToken();
            int x = (int) in.nval;
            if (bad.contains(x)) {
                continue;
            } else if (!last.containsKey(x)) {
                last.put(x, i);
                diff.put(x, 0);
            } else if (diff.get(x) == 0) {
                diff.put(x, i - last.get(x));
                last.put(x, i);
            } else {
                int commonDifference = i - last.get(x);
                if (commonDifference != diff.get(x)) {
                    bad.add(x);
                } else {
                    last.put(x, i);
                }
            }
        }
        diff.keySet().removeIf(bad::contains);
        System.out.println(diff.size());
        for (Integer key : diff.keySet()) {
            System.out.println(key + " " + diff.get(key));
        }
    }
}
