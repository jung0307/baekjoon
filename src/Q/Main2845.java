package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2845 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int a1 = Integer.parseInt(s1[0]);
        int a2 = Integer.parseInt(s1[1]);

        int b1 = Integer.parseInt(s2[0]);
        int b2 = Integer.parseInt(s2[1]);
        int b3 = Integer.parseInt(s2[2]);
        int b4 = Integer.parseInt(s2[3]);
        int b5 = Integer.parseInt(s2[4]);

        int c = a1 * a2;

        System.out.println((b1 - c) + " " + (b2 - c) + " " + (b3 - c) + " " + (b4 - c) + " " + (b5 - c));

    }
}
