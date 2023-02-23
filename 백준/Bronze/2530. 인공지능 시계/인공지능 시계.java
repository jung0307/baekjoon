

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int m = n/60;
        int se = n%60;

        if(m >= 60) {
            a = a + m/60;
            m = m%60;
        }

        if(c+se >= 60) {
            c = c + se - 60;
            m = m + 1;
        }else {
            c = c + se;
        }

        if(b+m >= 60) {
            b = b + m - 60;
            a = a + 1;

        }else {
            b = b + m;
        }

        if(a >= 24) {
            a = a%24;
        }

        System.out.printf("%d %d %d" ,a,b,c);


    }
}
