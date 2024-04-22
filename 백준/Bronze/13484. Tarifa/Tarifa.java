import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());

            sum = sum + a;
        }

        System.out.println((X * (N + 1)) - sum);

    }
}
