import java.util.*;
import java.io.*;

public class theLostCow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lostcow.out")));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int ans = 0;
        int increment = 1;
        boolean pos = true;
        while (x != y) {
            if (pos) {
                if (x < y && y <= x + increment) {
                    ans += Math.abs(x-y);
                    break;
                } else ans += increment * 2;
            } else {
                if (x > y && y >= x - increment) {
                    ans += Math.abs(x-y);
                    break;
                } else ans += increment * 2;
            }
            pos = !pos;
            increment *= 2;
        }

        pw.println(ans);
        pw.close();
    }
}
