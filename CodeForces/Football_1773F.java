import java.util.*;

public class Football_1773F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int minDraws = Math.max(0, n - (a + b));
        if (n == 1 && a == b) {
            minDraws = Math.max(minDraws, 1);
        }

        System.out.println(minDraws);

        int scoringGames = n - minDraws;

        // Print (minDraws - 1) plain 0:0 draws
        for (int i = 0; i < minDraws - 1; i++) {
            System.out.println("0:0");
        }

        // Distribute a and b goals across scoringGames
        int ga = a, gb = b;
        for (int i = 0; i < scoringGames; i++) {
            int goalsA = 0, goalsB = 0;
            if (i == scoringGames - 1) {
                // Last scoring game: dump all remaining
                goalsA = ga;
                goalsB = gb;
            } else {
                if (ga > 0) { goalsA = 1; ga--; }
                else if (gb > 0) { goalsB = 1; gb--; }
            }
            System.out.println(goalsA + ":" + goalsB);
        }

        if (minDraws > 0) {
            if (scoringGames == 0) {
                System.out.println(a + ":" + b);
            } else {
                System.out.println("0:0");
            }
        }
    }
}