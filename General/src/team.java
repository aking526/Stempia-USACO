import java.io.*;
import java.util.*;

public class team {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N = Integer.parseInt(br.readLine());

        int res = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            for (int j = 0; j < 3; j++) cnt += Integer.parseInt(st.nextToken());
            if (cnt >= 2) res++;
        }

        pw.println(res);
        pw.close();
    }
}