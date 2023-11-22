import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String s[] = br.readLine().split(" ");

        int l = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);

        for(int i = 2; i < s.length; i++) {

            if(l <= r) {
                l = l + Integer.parseInt(s[i]);
            }else {
                r = r + Integer.parseInt(s[i]);
            }

        }

        int d = (int)Math.abs(l - r);
        int cnt = 0;

        while (d != 0) {

            if(d >= 100) {
                d = d - 100;
            } else if (d >= 50) {
                d = d - 50;
            } else if (d >= 20) {
                d = d - 20;
            } else if (d >= 10) {
                d = d - 10;
            } else if (d >= 5) {
                d = d - 5;
            } else if (d >= 2) {
                d = d - 2;
            } else if (d >= 1) {
                d = d - 1;
            }

            cnt++;
        }

        System.out.println(cnt);

    }
}
