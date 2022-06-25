import java.io.*;
import java.util.StringTokenizer;

public class speedingTicket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter("speeding.out");
        StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokenizer1.nextToken()), M = Integer.parseInt(tokenizer1.nextToken());

        int[] limit = new int[101];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
            int seg = Integer.parseInt(tokenizer2.nextToken()), lim = Integer.parseInt(tokenizer2.nextToken());
            int end = idx + seg;
            for (; idx < end; idx++) limit[idx] = lim;
        }

        int ans = 0;
        idx = 0;
        for (int i = 0; i < M; i++) {
            StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
            int seg = Integer.parseInt(tokenizer2.nextToken()), spd = Integer.parseInt(tokenizer2.nextToken());
            int end = idx + seg;
            for (; idx < end; idx++) ans = Math.max(ans, Math.max(0, spd - limit[idx]));
        }

        pw.println(ans);
        pw.close();
    }
}
