

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int L = Integer.parseInt(s[0]);
        int R = Integer.parseInt(s[1]);
        int A = Integer.parseInt(s[2]);

        int M = Math.max(L ,R);
        int m = Math.min(L ,R);

        if(M == m) {
            System.out.println(M + m + A/2 + A/2);
        }else {
            if(M > m + A) {
                System.out.println(2 * (m + A));
            }else {
                A = A - (M - m);
                System.out.println(2 * M + A/2 + A/2);
            }
        }
    }
}
