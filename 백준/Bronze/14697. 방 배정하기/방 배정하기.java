import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= n / b; j++) {
                for (int k = 0; k <= n / c; k++) {
                    if (a * i + b * j + c * k == n) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }

        System.out.println(0);
    }
}