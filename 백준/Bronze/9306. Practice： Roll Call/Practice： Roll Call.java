import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String a = br.readLine();
            String b = br.readLine();
            sb.append("Case " + (i + 1) +": " + b + ", " + a +"\n");
        }

        System.out.print(sb.toString());

    }
}
