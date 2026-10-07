
import java.util.*;

public class Three_Activities_1914D {

    static class Info implements Comparable<Info> {

        int num;
        int idx;

        public Info(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Info obj) {
            if (this.num == obj.num) {
                return this.idx - obj.idx;
            }
            return obj.num - this.num;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Info s[] = new Info[n];
            Info m[] = new Info[n];
            Info b[] = new Info[n];
            for (int i = 0; i < n; i++) {
                s[i] = new Info(sc.nextInt(), i);
            }
            for (int i = 0; i < n; i++) {
                m[i] = new Info(sc.nextInt(), i);
            }
            for (int i = 0; i < n; i++) {
                b[i] = new Info(sc.nextInt(), i);
            }
            Arrays.sort(s);
            Arrays.sort(m);
            Arrays.sort(b);
            int max = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (s[i].idx != m[j].idx && s[i].idx != b[k].idx && m[j].idx != b[k].idx) {
                            max = Math.max(max, s[i].num + m[j].num + b[k].num);
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}
