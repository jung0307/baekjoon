

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        String a = s[0];
        String b = s[1];
        String c = s[2];
        String d = s[3];

        System.out.println(Long.parseLong(a+b) + Long.parseLong(c+d));

    }
}
