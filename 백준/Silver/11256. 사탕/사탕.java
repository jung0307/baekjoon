import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            String s[] = br.readLine().split(" ");
            int J = Integer.parseInt(s[0]);
            int N = Integer.parseInt(s[1]);
            int cnt = 0;

            int arr[] = new int[N];

            for(int j = 0; j < N; j++) {
                String ss[] = br.readLine().split(" ");
                arr[j] = Integer.parseInt(ss[0]) * Integer.parseInt(ss[1]);
            }

            Arrays.sort(arr);

            while (J > 0) {
                J = J - arr[N - 1];
                N--;
                cnt++;
            }

            sb.append(cnt + "\n");
        }

        System.out.print(sb.toString());

    }
}
