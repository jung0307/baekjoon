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

            int xa = Integer.parseInt(s[0]);
            int ya = Integer.parseInt(s[1]);
            int fa = Integer.parseInt(s[2]);
            int xb = Integer.parseInt(s[3]);
            int yb = Integer.parseInt(s[4]);
            int fb = Integer.parseInt(s[5]);

            int x = (int)Math.abs(xb - xa);
            int y = (int)Math.abs(yb - ya);
            int f = fb + fa;

            sb.append(x + y + f + "\n");
        }

        System.out.print(sb.toString());

    }
}
