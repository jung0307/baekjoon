package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15963 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        long n = Long.parseLong(s[0]);
        long m = Long.parseLong(s[1]);

        if(n == m) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }

    }
}
