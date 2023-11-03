import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            for(int j = 1 + i; j < n; j++) {
                sb.append(" ");
            }

            if(i == 0) {
                sb.append("*");
            }else {
                sb.append("*");

                for(int j = 0; j < 2*i - 1; j++) {
                    sb.append(" ");
                }

                sb.append("*");
            }

            sb.append("\n");

        }

        System.out.print(sb.toString());

    }
}
