package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1408 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(":");
        String s2[] = br.readLine().split(":");

        int h1 = Integer.parseInt(s1[0]);
        int m1 = Integer.parseInt(s1[1]);
        int se1 = Integer.parseInt(s1[2]);

        int h2 = Integer.parseInt(s2[0]);
        int m2 = Integer.parseInt(s2[1]);
        int se2 = Integer.parseInt(s2[2]);

        int a = h2 - h1;
        int b = m2 - m1;
        int c = se2 - se1;

        if (c < 0) {
            c = c + 60;
            b = b - 1;
        }

        if(b < 0) {
            b = b + 60;
            a = a - 1;
        }

        if(a < 0) {
            a = a + 24;
        }


        System.out.println(String.format("%02d" , a)+":"+String.format("%02d" , b)+":"+String.format("%02d" , c));

    }
}
