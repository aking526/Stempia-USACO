import java.io.*;
import java.util.StringTokenizer;

public class mixingMilk {
    static final int N = 3;
    static int capacity[], milk[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter pw = new PrintWriter("mixmilk.out");

        capacity = new int[N];
        milk = new int[N];
        for (int i = 0; i < 3; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            capacity[i] = Integer.parseInt(tokenizer.nextToken());
            milk[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < 100; i++) {
            pour(i % N, (i+1) % N);
        }

        for (int i = 0; i < 3; i++) pw.println(milk[i]);
        pw.close();
    }

    static void pour(int i, int j) {
        int can_pour = Math.min(milk[i], capacity[j] - milk[j]);
        milk[i] -= can_pour;
        milk[j] += can_pour;
    }
}
