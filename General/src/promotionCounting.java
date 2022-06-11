import java.io.*;
import java.util.*;

public class promotionCounting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("promote.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("promote.out")));

        int[][] a = new int[4][2];
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int gtp = a[3][1] - a[3][0];
        int stg = a[2][1] - a[2][0] + gtp;
        int bts = a[1][1] - a[1][0] + stg;

        pw.println(bts);
        pw.println(stg);
        pw.println(gtp);
        pw.close();
    }
}
