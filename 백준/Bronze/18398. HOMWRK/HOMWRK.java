import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine().trim());

            for(int j = 0; j < n; j++) {
                String s[] = br.readLine().split(" ");
                int A = Integer.parseInt(s[0]);
                int B = Integer.parseInt(s[1]);

                sb.append((A + B) + " " + (A * B) + "\n");
            }
        }

        System.out.print(sb.toString());

    }
}
