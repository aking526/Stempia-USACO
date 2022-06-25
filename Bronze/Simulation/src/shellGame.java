import java.io.*;
import java.util.StringTokenizer;

public class shellGame {
    public static int N;
    public static int[] pos, cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter("shell.out");

        N = Integer.parseInt(br.readLine());

        pos = new int[3];
        for (int i = 0; i < 3; i++) pos[i] = i;

        cnt = new int[3];
        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tokenizer.nextToken())-1, b = Integer.parseInt(tokenizer.nextToken())-1, g = Integer.parseInt(tokenizer.nextToken())-1;
            int temp = pos[a];
            pos[a] = pos[b];
            pos[b] = temp;
            cnt[pos[g]]++;
        }

        int res = 0;
        for (int i = 0; i < 3; i++) {
            res = Math.max(res, cnt[i]);
        }

        pw.println(res);
        pw.close();
    }
}
