import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a; i++) {
            int n = Integer.parseInt(br.readLine());

            int arrInt[] = new int[n + 1];
            int cnt = 0;

            for(int j = 1; j <= n; j++) {

                for(int k = 1; (j + 1) * k <= n; k++) {
                    if(arrInt[(j + 1) * k] == 0) {
                        arrInt[(j + 1) * k] = 1;
                    }else {
                        arrInt[(j + 1) * k] = 0;
                    }
                }

            }

            for(int j = 1; j <= n; j++) {
                if(arrInt[j] == 0) {
                    cnt++;
                }
            }

            sb.append(cnt + "\n");

        }

        System.out.print(sb.toString());

    }
}
