import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int s1 = 0;
            int s2 = 0;
            int s3 = 0;

            for(int j = 1; j <= n; j++) {
                s1 = s1 + j;
            }

            for(int j = 1; j <= 2 * n; j = j + 2) {
                s2 = s2 + j;
            }

            for(int j = 2; j <= 2 * n; j = j + 2) {
                s3 = s3 + j;
            }

            sb.append(s1 + " " + s2 + " " + s3 + "\n");
        }

        System.out.print(sb.toString());


    }
}
