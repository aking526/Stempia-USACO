import java.io.*;

public class bucketBrigade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("buckets.in"));
        PrintWriter pw = new PrintWriter("buckets.out");

        Pair<Integer, Integer> barn = new Pair<>(), rock = new Pair<>(), lake = new Pair<>();
        for (int i = 0; i < 10; i++) {
            char[] c = br.readLine().toCharArray();
            for (int j = 0; j < 10; j++) {
                if (c[j] == 'B') {
                    barn.first = i;
                    barn.second = j;
                } else if (c[j] == 'R') {
                    rock.first = i;
                    rock.second = j;
                } else if (c[j] == 'L') {
                    lake.first = i;
                    lake.second = j;
                }
            }
        }

        int res = Math.abs(barn.first - lake.first) + Math.abs(barn.second - lake.second);
        res--;

        if (barn.first == lake.first) {
            if (barn.first == rock.first && (barn.second < rock.second && rock.second < lake.second) || (lake.second < rock.second && rock.second < barn.second)) res += 2;
        }

        if (barn.second == lake.second) {
            if (barn.second == rock.second && (barn.first < rock.first && rock.first < lake.first) || (lake.first < rock.first && rock.first < barn.first)) res += 2;
        }

        pw.println(res);
        pw.close();
    }

    static class Pair<K, V> {
        K first;
        V second;
    }
}
