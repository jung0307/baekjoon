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
            int W = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);

            int a = (W * K) / 2;

            sb.append(a + "\n");
        }

        System.out.print(sb.toString());

    }
}
