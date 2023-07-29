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
            int sum = 0;

            for(int j = s.length() - 1; j >= 0; j--) {
                sum = sum + (int)Math.pow(2 , s.length() - j - 1) * Integer.parseInt((s.charAt(j)+"" ));
            }

            sb.append(sum+"\n");
        }

        System.out.print(sb.toString());
    }
}
