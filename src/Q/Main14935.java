package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14935 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");
        int a = 0;

        for(int i = 0; i < 100; i++) {

            a = Integer.parseInt(s[0])*s.length;

            String aa = a + "";

            s = aa.split("");

        }

        String s0[] = s;

        for(int i = 0; i < 1; i++) {

            a = Integer.parseInt(s[0])*s.length;

            String aa = a + "";

            s = aa.split("");

        }

       String q1 = "";
        String q2 = "";

        for(int i = 0; i < s0.length; i++) {
            q1 = q1 + s0[i];
        }
        for(int i = 0; i < s.length; i++) {
            q2 = q2 + s[i];
        }

        if(q1.equals(q2)) {
            System.out.println("FA");
        }else {
            System.out.println("NFA");
        }
    }

}
