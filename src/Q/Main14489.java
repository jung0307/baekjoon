package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14489 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int c = Integer.parseInt(br.readLine());

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        if(a+b - 2*c >= 0) {
            System.out.println(a+b - 2*c);
        }else {
            System.out.println(a+b);
        }

    }
}
