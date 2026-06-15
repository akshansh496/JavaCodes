import java.util.*;

public class United_We_Stand_1859A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while(testcase-- > 0){
            int n = sc.nextInt();

            int a[] = new int[n];

            int mn = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                mn = Math.min(mn, a[i]);
            }

            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            for(int x : a){
                if(x == mn) b.add(x);
                else c.add(x);
            }

            if(c.size() == 0){
                System.out.println(-1);
                continue;
            }

            System.out.println(b.size() + " " + c.size());

            for(int x : b){
                System.out.print(x + " ");
            }
            System.out.println();

            for(int x : c){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}