import java.util.*;
import java.io.*;

public class whiteSheet {
    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static final int mxN = Integer.MAX_VALUE;
    static final int mnN = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        Rectangle A = new Rectangle(fs.nextInt(), fs.nextInt(), fs.nextInt(), fs.nextInt());
        Rectangle B = new Rectangle(fs.nextInt(), fs.nextInt(), fs.nextInt(), fs.nextInt());
        Rectangle C = new Rectangle(fs.nextInt(), fs.nextInt(), fs.nextInt(), fs.nextInt());

        A = cut(A, B);
        A = cut(A, C);

        pw.println(A.area() == 0 ? "NO" : "YES");
        pw.close();
    }

    static class Rectangle {
        public int x1, y1, x2, y2, area;
        public Rectangle(int a, int b, int c, int d) {
            this.x1 = a;
            this.y1 = b;
            this.x2 = c;
            this.y2 = d;
        }

        public int area() {
            return (x2 - x1) * (y2 - y1);
        }
    }

    static Rectangle cut(Rectangle A, Rectangle B) {
        if (A.x1 >= B.x1 && B.x2 >= A.x1 && B.y1 <= A.y1 && B.y2 >= A.y2) {
            A.x1 = B.x2;
            A.x2 = Math.max(A.x2, B.x2);
        }

        if (A.x2 >= B.x1 && B.x2 >= A.x2 && B.y1 <= A.y1 && B.y2 >= A.y2) {
            A.x2 = B.x1;
            A.x1 = Math.min(A.x1, B.x1);
        }

        if (A.y1 >= B.y1 && B.y2 >= A.y1 && B.x1 <= A.x1 && B.x2 >= A.x2) {
            A.y1 = B.y2;
            A.y2 = Math.max(A.y2, B.y2);
        }

        if (A.y2 >= B.y1 && B.y2 >= A.y2 && B.x1 <= A.x1 && B.x2 >= A.x2) {
            A.y2 = B.y1;
            A.y1 = Math.min(A.y1, B.y1);
        }
        return A;
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
