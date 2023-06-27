
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            if(6 <= s.length() && s.length() <= 9) {
                sb.append("yes\n");
            }else {
                sb.append("no\n");
            }
        }

        System.out.print(sb.toString());

    }
}
