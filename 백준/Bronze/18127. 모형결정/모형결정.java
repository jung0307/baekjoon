import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        long cnt = 1;

        for(int i = 1; i <= B; i++) {
            int C = (A - 2) * i + 1;

            cnt = cnt + C;
        }

        System.out.println(cnt);

    }
}
