import java.io.*;
import java.util.StringTokenizer;

public class blockedBillboard {
    static final int MAXN = 2001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter("billboard.out");

        boolean[][] g = new boolean[MAXN][MAXN];
        for (int i = 0; i < 3; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(tokenizer.nextToken()) + 1000, y1 = Integer.parseInt(tokenizer.nextToken()) + 1000;
            int x2 = Integer.parseInt(tokenizer.nextToken()) + 1000, y2 = Integer.parseInt(tokenizer.nextToken()) + 1000;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i < 2) g[j][k] = true;
                    else g[j][k] = false;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < MAXN; i++) {
            for (int j = 0; j < MAXN; j++) {
                res += g[i][j] ? 1 : 0;
            }
        }

        pw.println(res);
        pw.close();
    }
}
