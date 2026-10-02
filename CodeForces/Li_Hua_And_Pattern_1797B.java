
import java.io.IOException;
import java.io.InputStream;

public class Li_Hua_And_Pattern_1797B {

    static class FastScanner {

        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        // Read next token as String
        String next() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            StringBuilder sb = new StringBuilder();

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }

        // Read int
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        // Read long
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        // Read double
        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        // Read float
        float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }

        // Read character
        char nextChar() throws IOException {
            return next().charAt(0);
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int count = 0;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] != arr[n - i - 1][n - j - 1]) {
                        count++;
                    }
                }
            }
            if (n % 2 == 1) {
                int mid = n / 2;

                for (int j = 0; j < n / 2; j++) {
                    if (arr[mid][j] != arr[mid][n - j - 1]) {
                        count++;
                    }
                }
            }
            if (count > k) {
                System.out.println("NO");
            } else if (n % 2 == 1) {
                System.out.println("YES");
            } else if ((k - count) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
