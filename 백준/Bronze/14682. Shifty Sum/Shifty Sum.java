import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int sum = N;

        for(int i = 0; i < K; i++) {
            N = N * 10;
            sum = sum + N;
        }

        System.out.println(sum);

    }
}
