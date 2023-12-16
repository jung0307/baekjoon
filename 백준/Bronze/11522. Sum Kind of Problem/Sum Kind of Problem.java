import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < P; i++) {
            String s[] = br.readLine().split(" ");
            int K = Integer.parseInt(s[0]);
            int N = Integer.parseInt(s[1]);

            int cnt = 0;

            for(int j = 1; j <= N; j++) {
                cnt = cnt + j;
            }

            sb.append(K + " " + cnt);

            cnt = 0;

            for(int j = 1; j <= 2*N - 1; j = j + 2) {
                cnt = cnt + j;
            }

            sb.append(" " + cnt);

            cnt = 0;

            for(int j = 2; j <= 2*N; j = j + 2) {
                cnt = cnt + j;
            }

            sb.append(" " + cnt + "\n");

        }

        System.out.print(sb.toString());

    }
}
