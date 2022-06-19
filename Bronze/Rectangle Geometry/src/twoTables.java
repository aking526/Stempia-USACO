import java.util.*;
import java.io.*;

public class twoTables {
    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static final int mxN = Integer.MAX_VALUE;
    static final int mnN = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        int t = fs.nextInt();

        for (int i = 0; i < t; i++) {
            test_case();
        }

        pw.close();
    }

    public static void test_case() throws IOException {
        int W = fs.nextInt(), H = fs.nextInt();
        int x1 = fs.nextInt(), x2 = fs.nextInt(), y1 = fs.nextInt(), y2 = fs.nextInt();
        int w = fs.nextInt(), h = fs.nextInt();

        int left_dist = x1, right_dist = W - x2;
        int down_dist = y1, up_dist = H - y2;



    }

    static int ceil_divide(int a, int b) {
        return (a + b - 1) / b;
    }

    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b%a, a);
    }

    static int lcm(int a, int b) {
        return (a*b)/gcd(a, b);
    }

    static void printArr(int[] arr) {
        pw.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            pw.print(" " + arr[i]);
        }
        pw.println();
    }

    public static void outputGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                pw.print(grid[i][j]);
            }
            pw.println();
        }
    }

    static class FastScanner {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public FastScanner(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] readArr(int N) {
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = this.nextInt();
            }

            return arr;
        }


    }
}
