import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int K = Integer.parseInt(s[0]);
            int N = Integer.parseInt(s[1]);

            int sum = 0;

            for(int j = 1; j <= N; j++) {
                sum = sum + j;
            }

            sb.append(K + " " + (sum + N) + "\n");
        }

        System.out.print(sb.toString());

    }
}
