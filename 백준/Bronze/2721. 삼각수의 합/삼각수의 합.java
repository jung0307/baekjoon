
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int j = 1; j <= m; j++) {
                sum = sum + T(j + 1) * j;
            }
            sb.append(sum+"\n");
        }

        System.out.print(sb.toString());

    }

    static int T(int a) {
        int sum = 0;
        for(int i = 1; i <= a; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
