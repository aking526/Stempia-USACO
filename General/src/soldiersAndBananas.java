import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class soldiersAndBananas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(tokenizer.nextToken()), n = Integer.parseInt(tokenizer.nextToken()), w = Integer.parseInt(tokenizer.nextToken());

        int res = 0;
        for (int i = 1; i <= w; i++) {
            res += k*i;
        }
        pw.println(Math.max(0, res - n));
        pw.close();
    }
}
