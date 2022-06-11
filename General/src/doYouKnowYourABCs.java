import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class doYouKnowYourABCs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int[] a = new int[7];
        for (int i = 0; i < 7; i++) a[i] = Integer.parseInt(tokenizer.nextToken());
        Arrays.sort(a);

        pw.println(a[0] + " " + a[1] + " " + (a[6] - a[0] - a[1]));
        pw.close();
    }
}
