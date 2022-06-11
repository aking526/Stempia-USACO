import java.io.*;
import java.util.StringTokenizer;

public class teleportation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());


        pw.println(Math.min(Math.abs(a-b), Math.min(Math.abs(a-x), Math.abs(a-y)) + Math.min(Math.abs(b-x), Math.abs(b-y))));
        pw.close();
    }
}