import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);

            int best = N - 1;

            sb.append("Case " + (i + 1) + ": " + (M - best) + "\n");
        }

        System.out.print(sb.toString());

    }
}