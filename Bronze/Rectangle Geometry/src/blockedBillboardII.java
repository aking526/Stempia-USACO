import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class blockedBillboardII {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter("billboard.out");

        int[] x = new int[5];
        int[] y = new int[5];
        for (int i = 0; i < 4; i++) {
            x[i+1] = sc.nextInt();
            y[i+1] = sc.nextInt();
        }


        if (x[4] >= x[2] && x[3] <= x[1] && y[4] >= y[2] && y[3] <= y[1]) pw.println(0); // complete overlap or same coordinates
        else if (x[3] <= x[1] && y[3] <= y[1] && y[4] > y[1] && x[4] >= x[2]) pw.println((x[2] - x[1]) * (y[2] - y[4])); // top is not covered
        else if (y[3] < y[2] && x[3] <= x[1] && y[4] >= y[2] && x[4] >= x[2]) pw.println((x[2] - x[1]) * (y[3] - y[1])); // bottom is not covered
        else if (x[4] > x[1] && x[3] <= x[1] && y[4] >= y[2] && y[3] <= y[1]) pw.println((x[2] - x[4]) * (y[2] - y[1])); // right is not covered
        else if (x[3] < x[2] && x[4] >= x[2] && y[4] >= y[2] && y[3] <= x[1]) pw.println((x[3] - x[1]) * (y[2] - y[1])); // left is not covered
        else pw.println((x[2] - x[1]) * (y[2] - y[1]));

        pw.close();
    }
}
