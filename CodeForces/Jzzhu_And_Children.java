
import java.util.*;

public class Jzzhu_And_Children {

    static class Info {

        int child;
        int candy;

        public Info(int child, int candy) {
            this.child = child;
            this.candy = candy;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Info> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Info(i + 1, sc.nextInt()));
        }
        while (queue.size() != 1) {
            Info i = queue.poll();
            if (i.candy > m) {
                queue.add(new Info(i.child, i.candy - m));
            }
        }
        System.out.println(queue.poll().child);

    }
}
