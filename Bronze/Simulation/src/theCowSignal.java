import java.io.*;
import java.util.StringTokenizer;

public class theCowSignal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("cowsignal.in"));
        PrintWriter pw = new PrintWriter("cowsignal.out");
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(tokenizer.nextToken()), N = Integer.parseInt(tokenizer.nextToken()), K = Integer.parseInt(tokenizer.nextToken());
        String[] grid = new String[M];
        for (int i = 0; i < M; i++) grid[i] = br.readLine();

        for (int i = 0; i < M; i++) {
            for (int k = 0; k < K; k++) {
                for (int j = 0; j < N; j++) {
                    for (int k2 = 0; k2 < K; k2++) {
                        pw.print(grid[i].charAt(j));
                    }
                }
                pw.println();
            }
        }
        pw.close();
    }
}
