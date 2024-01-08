import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            String s[] = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]); // 국가의 수
            int M = Integer.parseInt(s[1]); // 비행기의 수

            int arr[][] = new int[N][N];

            for(int j = 0; j < M; j++) {
                String s2[] = br.readLine().split(" ");
                int a = Integer.parseInt(s2[0]);
                int b = Integer.parseInt(s2[1]);

                arr[a - 1][b - 1] = 1;
            }

            sb.append(N - 1 + "\n");

        }

        System.out.print(sb.toString());

    }
}
