package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5598 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length; i++) {
            int a = (int)(s[i].charAt(0));
            if(a == 65) {
                a = 88;
            }else if (a == 66) {
                a = 89;
            } else if (a == 67) {
                a = 90;
            }else {
                a = a - 3;
            }

            sb.append((char) a);
        }

        System.out.println(sb.toString());
    }
}
