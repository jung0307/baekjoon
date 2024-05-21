import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            String s[] = br.readLine().split(" ");
            int d = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            int S = Integer.parseInt(s[2]);
            int p = Integer.parseInt(s[3]);

            if(d + (p * n) > S * n) {
                sb.append("do not parallelize\n");
            } else if (d + (p * n) < S * n) {
                sb.append("parallelize\n");
            }else {
                sb.append("does not matter\n");
            }
        }

        System.out.print(sb.toString());

    }
}
