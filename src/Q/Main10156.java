package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10156 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        if(a*b - c < 0) {
            System.out.println("0");
        }else {
            System.out.println(a * b - c);
        }

    }
}
