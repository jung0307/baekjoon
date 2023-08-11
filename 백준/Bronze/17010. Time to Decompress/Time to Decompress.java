import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            for(int j = 0; j < Integer.parseInt(s[0]); j++) {
                sb.append(s[1]);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());

    }
}
