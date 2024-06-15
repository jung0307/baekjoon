import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            int cnt = 0;

            for(int j = 1; j <= a; j++) {
                for(int k = 1; k <= b; k++) {
                    for(int l = 1; l <= c; l++) {
                        if(j % k == k % l && k % l == l % j) {
                            cnt++;
                        }
                    }
                }
            }

            sb.append(cnt + "\n");

        }

        System.out.print(sb.toString());



    }
}
