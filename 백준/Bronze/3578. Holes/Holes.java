import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = n;

        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        if(n == 0) {
            sb.append("1");
        } else if (n == 1) {
            sb.append("0");
        } else {
            while (cnt != n) {

                if(m % 2 == 1) {
                    sb.append("4");
                    cnt++;
                    m = m - 1;
                }else {
                    sb.append("8");
                    cnt = cnt + 2;
                    m = m - 2;
                }
            }
        }

        System.out.println(sb.toString());
    }
}
