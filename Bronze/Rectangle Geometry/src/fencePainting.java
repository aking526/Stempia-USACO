import java.io.*;
import java.util.StringTokenizer;

public class fencePainting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter("paint.out");
        StringTokenizer tokenizer1 = new StringTokenizer(br.readLine()), tokenizer2 = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(tokenizer1.nextToken()), b = Integer.parseInt(tokenizer1.nextToken());
        int c = Integer.parseInt(tokenizer2.nextToken()), d = Integer.parseInt(tokenizer2.nextToken());

        pw.println((b-a) + (d-c) - Math.max(Math.min(b, d) - Math.max(a, c), 0));
        pw.close();
    }
}
