import java.io.*;
import java.util.StringTokenizer;

public class squarePasture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("square.in"));
        PrintWriter pw = new PrintWriter("square.out");
        StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
        StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());

        int[] a = new int[4], b = new int[4];
        for (int i = 0; i < 4; i++) a[i] = Integer.parseInt(tokenizer1.nextToken());
        for (int i = 0; i < 4; i++) b[i] = Integer.parseInt(tokenizer2.nextToken());

        pw.println(sq_area(Math.min(a[0], b[0]), Math.min(a[1], b[1]), Math.max(a[2], b[2]), Math.max(a[3], b[3])));
        pw.close();
    }
    static int sq_area(int bl_x, int bl_y, int tr_x, int tr_y) {
        int length = tr_y - bl_y;
        int width = tr_x - bl_x;
        int side = Math.max(length, width);
        return side * side;
    }
}
