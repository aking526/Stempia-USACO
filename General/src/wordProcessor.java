import java.io.*;
import java.util.StringTokenizer;

public class wordProcessor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("word.in"));
        PrintWriter pw = new PrintWriter("word.out");
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokenizer.nextToken()), K = Integer.parseInt(tokenizer.nextToken());
        String[] s = br.readLine().split(" ");

        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            if (cnt + s[i].length() > K) {
                pw.println();
                cnt = 0;
            }
            if (cnt != 0) pw.print(" ");
            pw.print(s[i]);
            cnt += s[i].length();
        }
        pw.close();
    }
}
