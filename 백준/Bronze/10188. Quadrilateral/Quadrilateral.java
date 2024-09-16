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

            for(int j = 0; j < b; j++) {
                for(int k = 0; k < a; k++) {
                    sb.append("X");
                }
                sb.append("\n");
            }

            if(i < n - 1) {
                sb.append("\n");
            }
        }

        System.out.print(sb.toString());

    }
}
