package Leetcode;
import java.util.*;
public class Task_Scheduler {
    public static void main(String[] args) {
        char tasks[]={'B','C','D','A','A','A','A','G'};
        int n=1;
        int freq[] = new int[26];
        for (char x : tasks) {
            freq[x - 'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                pq.add(freq[i]);
        }
        int count = 0;
        while (!pq.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int c = 0;
            while (c < n + 1 && !pq.isEmpty()) {
                int temp = pq.poll();
                if (temp > 1)
                    list.add(temp - 1);
                c++;
                count++;
            }
            // If tasks are still remaining,
            // unused positions in this cycle are idle.
            if (!list.isEmpty()) {
                count += (n + 1 - c);
            }
            for (int x : list) {
                pq.add(x);
            }
        }
        System.out.println(count);

    }
}
