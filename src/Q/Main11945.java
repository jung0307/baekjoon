package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11945 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int r = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < r; i++) {
            String s1[] = br.readLine().split("");

            for(int j = 0; j < c; j++) {
                sb.append(s1[c - 1 - j]);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());



    }
}
